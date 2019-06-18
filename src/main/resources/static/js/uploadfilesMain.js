$(document).ready(function () {
    console.log("Run");//send
    $("#uploadForm").submit(function (e) {
        e.preventDefault();
        console.log("send file");
        $.ajax({
            url: "http://localhost:8081/api/uploadFile",
            type: "POST",
            data: new FormData(this),
            contentType: false,
            cache: false,
            processData: false,
            headers: {
                'Access-Control-Allow-Origin': '*'
            },
            success:function () {
                alert("OK")
            }
        })

        return false;
    })
});