/*
 * Author : Mr.Doe
 * mypagesidebar.jsp 에 추가된 '설정'을 클릭시 발생하는 이벤트 추가.
 */

document.querySelector('#blog').addEventListener('click', (e)=> {
    e.preventDefault();
    location.href = '/blog/page';
});

document.querySelectorAll('.snb_menu .menu_link').forEach((idx)=>{
    idx.addEventListener('click', (e)=> {
        const clicked = e.target;

        if(clicked.tagName == 'A') {
            if(clicked.closest('ul').classList.contains('list-group')) {
                console.log(clicked.style);
            }
        }
    });
});

document.querySelectorAll('.list-group .list-group-item a').forEach((idx)=>{
    idx.addEventListener('click', (e)=> {
        e.preventDefault();
        const clicked = e.target;
        console.log(clicked.tagName, clicked.innerText);
        console.log('test');
    });
});

function selected_tab_menu() {
    const location = window.location.pathname;

    if(location.includes('/mypage')) {
        const here = document.getElementById('mypage');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    } else if(location.includes('/buying')) {
        const here = document.getElementById('buying');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    } else if(location.includes('/selling')) {
        const here = document.getElementById('selling');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    } else if (location.includes('/adminList')) {
        const here = document.getElementById('adminList');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    } else if (location.includes('/blog')) {
        const here = document.getElementById('blog');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    }
}

// edit by sang hyun 08/19
document.addEventListener('click', (e) => {
    if(e.target.id == 'delBtn'){
        console.log(e.target.dataset.pno);
        isDel = remove(e.target.dataset.pno);
        if(isDel){
            alert('삭제되었습니다');
        }
        else {
            alert('삭제에 실패 하였습니다');
        }
    }
});

async function getListFromServer(pageNo=1){
    try {
      const resp = await fetch('/product/adminList');
      const productDTO = await resp.json();
      return productDTO;
    } catch (error) {
      console.log(error);
    }
}

async function remove(pno){
    try {
        const url = '/product/delete/'+pno;
        const config = {
            method : 'DELETE'
        }
        const resp = await fetch(url, config);
        return resp.text();
    } catch (error) {
        console.log(error);
    }
}

