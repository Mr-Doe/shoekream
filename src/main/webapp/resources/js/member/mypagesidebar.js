/**
 * Author : Mr.Doe
 * mypagesidebar.jsp 에 추가된 '설정'을 클릭시 발생하는 이벤트 추가.
 */

document.querySelectorAll('.snb_menu .menu_link').forEach((idx)=>{
    idx.addEventListener('click', (e)=> {
        const clicked = e.target;

        if(clicked.tagName == 'A') {
            if(clicked.closest('ul').classList.contains('list-group')) {
                console.log(clicked.style);
            }
        }

        if(clicked.id == 'operation_config') {
            e.preventDefault();
            const content = document.querySelector('.content_area');

            html = `
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item"><a href="#">First item</a></li>
                        <li class="list-group-item"><a href="#">Second item</a></li>
                        <li class="list-group-item"><a href="#">Third item</a></li>
                        <li class="list-group-item"><a href="#">Fourth item</a></li>
                    </ul>
                `;

            content.innerHTML = html;

            document.querySelectorAll('.snb_menu .menu_link').forEach((idx)=> {
                idx.style.color = '';
                idx.style.fontSize = '';
                idx.style.fontWeight = '';
            });

            const here = document.getElementById('operation_config');
            here.style.color = 'black';
            here.style.fontSize = '18px';
            here.style.fontWeight = 700;
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
    } else if(location.includes('/detail')) {
        const here = document.getElementById('detail');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    }
}