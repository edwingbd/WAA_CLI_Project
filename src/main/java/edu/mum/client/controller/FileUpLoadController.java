package edu.mum.client.controller;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequestMapping("/fileUpLoad")
@Controller
public class FileUpLoadController {

    @GetMapping("/")
    private String showForm()
    {
        System.out.println("showForm()");
        return "uploadfiles" ;
    }

    @PostMapping(value = "/uploadFile")
    public String submit(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println("step1");
        byte[] bytes = file.getBytes();
/*        Path path = Paths.get(Constants.UPLOAD + file.getOriginalFilename());
        Files.write(path, bytes);*/

        // prepare the file that receive to send to the server
        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file",new ByteArrayResource(bytes));

        // it must chage to the server url.
        String serverUrl = "http://localhost:8081/api/uploadFile/";


        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        //headers.set("Authorization", "Bearer " + tokenHelper.getToken());
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);





        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

//
        //      ResponseEntity<String> response = restTemplate.postForEntity(serverUrl, requestEntity, String.class);
        ResponseEntity<String> responseEntity = restTemplate.exchange(serverUrl, HttpMethod.POST, requestEntity, String.class);
        return "redirect:/";
    }
}
