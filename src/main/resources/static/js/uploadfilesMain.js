$(document).ready(function () {
    console.log("Run");//send
    $("#uploadForm").submit(function (e) {


        e.preventDefault();
        console.log("send file");




        $.ajax({
            url: "http://localhost:8081/api/v1/file/upload/",
            type: "POST",
            data: new FormData(this),
            contentType: false,
            cache: false,
            processData: false,
            headers: {
                'Access-Control-Allow-Origin': '*',
                'Authorization':'Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0aW5hQG11bS5lZHUiLCJ1c2VybmFtZSI6InRpbmFAbXVtLmVkdSIsInJvbGVzIjpbIlNBVkVfRU5UUlkiLCJTQVZFX0JMT0NLIiwiVklFV19FTlRSWV9SRVBPUlQiLCJWSUVXX0VYVFJBX0NSRURJVF9SRVBPUlQiLCJEQVRBX0lNUE9SVCJdLCJpZCI6Mn0.QHG5qpsyIema8mllRUW7bV7bkr2AlVioFJnpZS6uoy50ahz9lPdpu7C7U1A3lUaeDdrxCAZHmZ-dxw92wIUbPQ'
            },
            success:function () {
                alert("OK")
            }
        })

        return false;
    })
});