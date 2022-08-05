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
                html += `<li><a href="#">${index.categoryName}</a></li>`;
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
        let html = '';
        if(result.length > 0) {
            result.forEach((index) => {
                html += `<li><a href="#">${index.brandName}</a></li>`;
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
                html += `<label><input type="radio">${index.sizeValue}</label>`;
            });
        }
        document.getElementById('filter-size').innerHTML = html;
    });
}