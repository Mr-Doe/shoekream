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

document.getElementById('registerBtn').addEventListener('click', (e) => {
    e.preventDefault();
    window.location.href = "/member/register";
});

document.getElementById('loginBtn').addEventListener('click', (e) => {
    e.preventDefault();
    
    // let loginObj = {
    //     email: document.getElementById("email").value,
    //     pwd: document.getElementById("pwd").value
    // };

    // loginToServer(loginObj).then(result => {
    //     if (result > 0) {
    //         alert("로그인 성공!");
    //         window.location.href = "/";
    //     } else {
    //         alert("로그인 실패...");
    //         window.location.href = "#";
    //         document.getElementById("pwd").value = '';
    //     }
    // });

    loginAction();
});

/**
 * Author : Mr.Doe
 * 로그인 버튼 클릭 시 액션에 대한 공통 부분을 메서드로 빼고,
 * 로그인 정보 input 태그들에서 엔터 액션 추가
 */

function loginAction() {
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
}

document.querySelectorAll('.input_item input')
.forEach((idx)=> {
    idx.addEventListener('keydown', (e)=> {
        // e.preventDefault();

        if(e.key == 'Enter') {
            loginAction();
        }
    });
});

// Mr.Doe done.