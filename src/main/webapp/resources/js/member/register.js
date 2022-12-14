async function insertToServer(registerObj) {
    try {
        const url = "/member/register";
        const config = {
            method: "post",
            headers: {
                'Content-type': 'application/json; charset=utf-8'
            },
            body: JSON.stringify(registerObj)
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (error) {
        console.log(error);
    }
   
}

document.getElementById('registerBtn').addEventListener('click', (e) => {
    e.preventDefault();
    let emailVal = document.getElementById("email").value;
    let pwdVal = document.getElementById("pwd").value;
    let nickNameVal = document.getElementById("nickName").value;

    let registerObj = {
        email: emailVal,
        pwd: pwdVal,
        nickName: nickNameVal
    }

    if (registerObj.email == null || registerObj.email == '') {
        alert("이메일을 입력해 주세요!");
    } else if (registerObj.pwd == null || registerObj.pwd == '') {
        alert("비밀번호를 입력해 주세요!");
    } else if (registerObj.nickName == null || registerObj.nickName == ''){
        alert("닉네임을 입력해 주세요!");
    } else {
        insertToServer(registerObj).then(result => {
            alert("회원가입이 완료됐습니다");
            window.location.href = "/member/login";
        }); 
    }
});