$(document).ready(function () {
    console.log("Run 2019/06/18");//send

    $("#uploadForm").submit(function (e) {
        console.log("Run2  2019/06/18");//send
        e.preventDefault();
        console.log("send 1 file");
        $.ajax({
            url: "http://localhost:8081/api/file/upload/",
            type: "POST",
            data: new FormData(this),
            contentType: false,
            cache: false,
            processData: false,
            headers: {
                'Access-Control-Allow-Origin': '*',
                'Authorization':'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4uYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNTYwOTIzNDc1LCJhdXRob3JpdGllcyI6WyJBRE1JTiJdLCJqdGkiOiJhMzVmNTgyMC05MTgxLTQzZTItOGQ4OS0wMTA2Y2VmNWEzM2IiLCJjbGllbnRfaWQiOiJ0ZXN0and0Y2xpZW50aWQifQ.xKLCgxVgmnlm-Gd2OF2aLec_jPphQ9-QIWJH0R0de-0'
                // 'Authorization':'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4uYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNTYwOTIyMDEwLCJhdXRob3JpdGllcyI6WyJBRE1JTiJdLCJqdGkiOiIzOTIzZmVjNy1jYTA2LTQ4OTAtYWY3Yy1mNmZjZDUxZjI2MGYiLCJjbGllbnRfaWQiOiJ0ZXN0and0Y2xpZW50aWQifQ.K6Ugtmz1iZjDQ45ShWIfIBEul0_NeoR6gZo4mTIeddQ'
            },
            success:function () {
                alert("OK")
            }
        })

        return false;
    })

    $("#uploadForm2").submit(function (e) {
        console.log("Run2  2019/06/18");//send
        e.preventDefault();
        console.log("send file");
        $.ajax({
            url: "http://localhost:8081/api/file/upload2/",
            type: "POST",
            data: new FormData(this),
            contentType: false,
            cache: false,
            processData: false,
            headers: {
                'Access-Control-Allow-Origin': '*',
                'Authorization':'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4uYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNTYwOTIzNDc1LCJhdXRob3JpdGllcyI6WyJBRE1JTiJdLCJqdGkiOiJhMzVmNTgyMC05MTgxLTQzZTItOGQ4OS0wMTA2Y2VmNWEzM2IiLCJjbGllbnRfaWQiOiJ0ZXN0and0Y2xpZW50aWQifQ.xKLCgxVgmnlm-Gd2OF2aLec_jPphQ9-QIWJH0R0de-0'
                // 'Authorization':'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4uYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNTYwOTIyMDEwLCJhdXRob3JpdGllcyI6WyJBRE1JTiJdLCJqdGkiOiIzOTIzZmVjNy1jYTA2LTQ4OTAtYWY3Yy1mNmZjZDUxZjI2MGYiLCJjbGllbnRfaWQiOiJ0ZXN0and0Y2xpZW50aWQifQ.K6Ugtmz1iZjDQ45ShWIfIBEul0_NeoR6gZo4mTIeddQ'
            },
            success:function () {
                alert("OK")
            }
        })

        return false;
    })
});