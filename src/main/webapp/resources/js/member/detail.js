async function removeFromServer(removeObj) {
    try {
        const url = "member/remove";
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
        
    }
}

document.getElementById('memberRemove').addEventListener('click', (e) => {
    e.preventDefault();
    const emailVal = document.getElementById('emVal').value;
    const removeObj = {email: emailVal};

    removeFromServer(removeObj).then(result => {
        alert("회원탈퇴 완료!")
    });
  });