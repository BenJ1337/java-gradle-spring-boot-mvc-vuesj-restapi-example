var myCars = [];
var carList = new Vue({
    el: '#bmw-list',
    created: function () {
        this.loadData();
    },
    data: {
        items: myCars
    },
    methods: {
        loadData: function () {
            $.ajax({
                contentType: "application/json",
                dataType: "json",
                url: "/cars/bmw",
                data: "-1",
                method: "Get",
                    success: response => {
                        this.content = "loaded";
                        for(var i = 0; i < response.length; i++) {
                            myCars.push(response[i]);
                        }
                        console.log(myCars);
                    },
                    error: err => console.log("Error: " + err)
                });
            }
        }
});

function addCar() {
    var form = $("#addCarForm");
    var newCar = getFormData(form);
    console.log(newCar);

    $.ajax({
        contentType: "application/json",
        dataType: "json",
        url: "/cars/add",
        data: JSON.stringify(newCar),
        method: "Post",
        success: response => {
            console.log(carList);
            console.log(response.data);
            myCars.push(response);
            console.log("new car successfull added");
        },
        error: err => {
            console.log(JSON.parse(err.responseText))
        }
    });
}

function getFormData($form) {
    var unindexed_array = $form.serializeArray();
    var indexed_array = {};

    $.map(unindexed_array, function(n, i){
        indexed_array[n['name']] = n['value'];
    });

    return indexed_array;
}