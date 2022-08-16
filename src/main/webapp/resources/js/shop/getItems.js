async function get_items_from_server() {
    try {
        const url = await fetch('/shop/get_items');
        const resp = url.json();
        return resp;
    } catch (error) {
        
    }
}

function call_items_from_server() {
    const show_items_table = document.getElementById('show_items');

    get_items_from_server().then(result=> {
        console.log(result);
    })
}