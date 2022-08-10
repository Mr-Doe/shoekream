async function loginToServer(loginObj) {
    try {
        const url = "/member/login";
        const config = {
            method: "post",
            headers: {
                'Content-type': 'application/json; charset=utf-8'
            },
            body: JSON.stringify(loginObj)
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (error) {
        console.log(error);
    }
   
}

document.getElementById('loginBtn').addEventListener('click', (e) => {
    e.preventDefault();
    let emailVal = document.getElementById("email").value;
    let pwdVal = document.getElementById("pwd").value;

    let loginObj = {
        email: emailVal,
        pwd: pwdVal
    }

    loginToServer(loginObj).then(result => {
        console.log(result);
        alert("로그인 성공!");
    });
});