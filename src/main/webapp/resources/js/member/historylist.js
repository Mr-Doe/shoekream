async function goToDetail(itemNoVal) {
    try {
        const url = '/member/historydetail';
        const config = {
            method: "post",
            headers: {
                'Content-Type': 'application/json; charset=utf-8'
              },
              body: JSON.stringify({itemNo: parseInt(itemNoVal)})
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (error) {
        console.log(error);
    }
}

let div = document.querySelectorAll('.purchase_item.buy');

for (let i = 0; i < div.length; i++) {
    div[i].addEventListener('click', function () {
        let itemNoVal = this.getAttribute('data-itemno');
        goToDetail(itemNoVal).then(result => {
            window.location.href = '/member/historydetail?itemNo='+itemNoVal;
        });
    })
}