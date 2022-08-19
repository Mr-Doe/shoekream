let filter_size = '', filter_brand = '', filter_category = '';
let getSize, getBrand, getCategory;

const urlParams = new URLSearchParams(window.location.search);
if(urlParams.has('shoe_category') || urlParams.has('shoe_brand') || urlParams.has('shoe_size')) {
    for(entry of urlParams.entries()) {
        if(entry[0] == 'shoe_size') {
            getSize =  entry[1];
        } else if(entry[0] == 'shoe_brand') {
            getBrand = entry[1];
        } else if(entry[0] == 'shoe_category') {
            getCategory = entry[1];
        }
    }
}

// CALL CATEGORY-filter-list from SERVER
async function callFilter_Category() {
    try {
        const resp = await fetch('/filter/ctgr');
        const result = await resp.json();
        return await result;
    } catch (error) {
        console.log(error);
    }
}

function getFilter_Category() {
    callFilter_Category().then(result => {
        let html = '';
        if(result.length > 0) {
            result.forEach((index) => {
                html += `<li><a href="${index.categoryId}">${index.categoryName}</a></li>`;
            });
        }
        document.getElementById('filter-category').innerHTML = html;
    });
}


// CALL BRAND-filter-list from SERVER
async function callFilter_Brand() {
    try {
        const resp = await fetch('/filter/brand');
        const result = await resp.json();
        return await result;
    } catch (error) {
        console.log(error);
    }
}

function getFilter_Brand() {
    callFilter_Brand().then(result => {
        const list = getBrand.split(',');

        let html = '';
        if(result.length > 0) {
            result.forEach((index) => {
                let result;
                for(const value of list) {
                    if(value == index.brandId) {
                        result = value;
                        break;
                    }
                }
                if(index.brandId == result) {
                    html += `<li><a style="color: black; font-weight: 700;" href="${index.brandId}">${index.brandName}</a></li>`;
                    if(filter_brand.length == 0) {
                        filter_brand = result;
                    } else {
                        filter_brand = "," + result;
                    }
                } else {
                    html += `<li><a href="${index.brandId}">${index.brandName}</a></li>`;
                }
            });
        }
        document.getElementById('filter-brand').innerHTML = html;
    });
}

// CALL SIZE-filter-list from SERVER
async function callFilter_Size() {
    try {
        const resp = await fetch('/filter/size');
        const result = await resp.json();
        return await result;
    } catch (error) {
        console.log(error);
    }
}

function getFilter_Size() {
    callFilter_Size().then(result => {
        let html = '';
        if(result.length > 0) {
            result.forEach((index) => {
                html += `<label><input type="checkbox" value="${index.sizeId}">${index.sizeValue}</label>`;
            });
        }
        document.getElementById('filter-size').innerHTML = html;
    });
}

// async function forward_to_product_controller(filter_category, filter_brand, filter_size) {
//     try {
//         const path = `/product/listPage`;
//         let url = '';

//         if(filter_category.length > 0) url += url.length == 0 ? `shoe_category=${filter_category}` : `&shoe_category=${filter_category}`;
//         if(filter_brand.length > 0) url += url.length == 0 ? `shoe_brand=${filter_brand}` : `&shoe_brand=${filter_brand}`;
//         if(filter_size.length > 0) url += url.length == 0 ? `shoe_size=${filter_size}` : `&shoe_size=${filter_size}`;

//         const final_url = url.length == 0 ? `${path}&pageNo=1&qty=12` : `${path}?${url}&pageNo=1&qty=12`;
//     } catch (error) {
//         console.log(error);
//     }
// }

document.querySelectorAll('#filter-category, #filter-brand, #filter-size, .filter_status .btn_delete, .force_click')
.forEach((filter) => {
    filter.addEventListener('click', (e)=> {
        e.preventDefault();
        const the_button = e.target;

        if(the_button.classList.contains('btn_delete')) {
            // 카테고리
            const category_children = document.querySelectorAll('#filter-category li a');
            category_children.forEach((idx)=> {
                idx.style.color = '';
                idx.fontWeight = '';
                filter_category = '';
            });
            // 브랜드
            const brand_children = document.querySelectorAll('#filter-brand li a');
            brand_children.forEach((idx)=> {
                idx.style.color = '';
                idx.style.fontWeight = '';
                filter_brand = '';
            });
            // 사이즈
            const size_children = document.querySelectorAll('#filter-size label');
            size_children.forEach((idx)=> {
                console.log(idx.tagName);
                idx.classList.remove('active');
                filter_size = '';
            });
        }

        // 사이즈 필터 체크
        if(the_button.parentNode.getAttribute('id') === 'filter-size') {
            const the_size_button = the_button.childNodes[0];
            console.log(the_size_button.tagName);
            if(!the_button.classList.contains('active')) {
                the_button.classList.add('active');

                filter_size += filter_size == 0 ? `${the_size_button.value}` : `,${the_size_button.value}`;
            } else {
                the_button.classList.remove('active');

                if(filter_size.includes(`${String(the_size_button.value)},`)) {
                    filter_size = filter_size.replace(`${String(the_size_button.value)},`, '');
                } else if(filter_size.includes(`,${String(the_size_button.value)}`)) {
                    filter_size = filter_size.replace(`,${String(the_size_button.value)}`, '');
                } else {
                    filter_size = '';
                }
            }
        }

        // 브랜드 필터 체크
        if(the_button.parentNode.parentNode.getAttribute('id') === 'filter-brand') {
            const the_brand_button = the_button.href.substring(the_button.href.lastIndexOf('/')+1);
            if(the_button.style.color != 'black') {
                the_button.style.color = 'black';
                the_button.style.fontWeight = 700;
                
                filter_brand += filter_brand == 0 ? `${the_brand_button}` : `,${the_brand_button}`
            } else {
                the_button.style.color = '';
                the_button.style.fontWeight = '';

                if(filter_brand.includes(`${String(the_brand_button)},`)) {
                    filter_brand = filter_brand.replace(`${String(the_brand_button)},`, '');
                } else if(filter_brand.includes(`,${String(the_brand_button)}`)) {
                    filter_brand = filter_brand.replace(`,${String(the_brand_button)}`, '');
                } else {
                    filter_brand = '';
                }
            }
        }

        // 카테고리 필터 체크
        if(the_button.parentNode.parentNode.getAttribute('id') === 'filter-category') {
            let sibling_nodes = document.querySelectorAll('#filter-category li a');
            sibling_nodes.forEach((node)=> {
                node.style.color = '';
                node.style.fontWeight = '';
            });

            the_button.style.color = 'black';
            the_button.style.fontWeight = 700;

            filter_category = the_button.href.substring(the_button.href.lastIndexOf('/')+1);
        }
        // spreadList(list.js) << Edit From LSH
        // forward_to_product_controller(filter_category, filter_brand, filter_size);
        spreadList(filter_brand, filter_category, filter_size);
        console.log(`ctgr : ${filter_category}, brand : ${filter_brand}, size : ${filter_size}`)

        const categoryList = filter_category.split(',');
        const brandList = filter_brand.split(',');
        const sizeList = filter_size.split(',');
        let list = [];
        for(const value of categoryList) {
            if(value.length > 0) list.push(value);
        }
        for(const value of brandList) {
            if(value.length > 0) list.push(value);
        }
        for(const value of sizeList) {
            if(value.length > 0) list.push(value);
        }


        console.dir(list);
        if(list.length > 0) {
            document.querySelector('.filter_status .status_num').style.display = 'block';
            document.querySelector('.filter_status .btn_delete').style.display = 'block';
        } else {
            document.querySelector('.filter_status .status_num').style.display = 'none';
            document.querySelector('.filter_status .btn_delete').style.display = 'none';
        }
        document.querySelector('.filter_status .status_num').innerText = '\u00A0\u00A0' + list.length;
    });
});