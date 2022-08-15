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

let listArea = document.querySelector('.empty_area').innerHTML;

document.querySelectorAll('.tab_link, .title, .count').forEach((list) =>{
    list.addEventListener('click', (e) => {
        document.querySelectorAll('.tab_item').forEach(tab => {
            tab.classList.remove('tab_on');
        });
        

        if (e.target.closest('div').id == 'totalCnt') {
            e.target.closest('div').classList.add('tab_on');
            document.getElementById('totalList').style.display = 'block';
            document.getElementById('bidList').style.display = 'none';
            document.getElementById('endList').style.display = 'none';
        } else if (e.target.closest('div').id == 'bidCnt') {
            e.target.closest('div').classList.add('tab_on');
            document.getElementById('totalList').style.display = 'none';
            document.getElementById('bidList').style.display = 'block';
            document.getElementById('endList').style.display = 'none';
        } else if (e.target.closest('div').id == 'endCnt') {
            e.target.closest('div').classList.add('tab_on');
            document.getElementById('totalList').style.display = 'none';
            document.getElementById('bidList').style.display = 'none';
            document.getElementById('endList').style.display = 'block';
        }
    });
});