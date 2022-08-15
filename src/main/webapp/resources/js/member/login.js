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

    let loginObj = {
        email: document.getElementById("email").value,
        pwd: document.getElementById("pwd").value
    };

    loginToServer(loginObj).then(result => {
        if (result > 0) {
            alert("로그인 성공!");
            window.location.href = "/";
        } else {
            alert("로그인 실패...");
            window.location.href = "#";
            document.getElementById("pwd").value = '';
        }
    });
});