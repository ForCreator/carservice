const mechanics = [
    {
        fullname: "John Pijhon",
        exper: 8,
        description: "expert by peugeot",
        photo: "../img/mech1.jpg"
    },
    {
        fullname: "Andrey Yaposhka",
        exper: 6,
        description: "expert by toyota",
        photo: "../img/mech2.jpg"
    },
    {
        fullname: "Anatoley Wasserman",
        exper: 79,
        description: "THE CLEVEREST",
        photo: "../img/mech3.jpg"
    },
    {
        fullname: "Fedor Ovchinikov",
        exper: 14,
        description: "expert by pizza",
        photo: "../img/mech4.jpg"
    }
]

function createMechCard(mech) {
    return '    <div class="card" style="width: 18rem;background: lightsteelblue">\n' +
        '        <img class="card-img-top" src="'+ mech.photo+ '" alt="Card image cap">\n' +
        '        <div class="card-body">\n' +
        '            <h5 class="card-title">'+mech.fullname +'</h5>\n' +
        '            <p class="card-text">Exp: '+mech.exper +'</p>\n' +
        '            <p class="card-text">'+ mech.description +'</p>\n' +
        '            <a href="#" class="btn btn-primary">Go somewhere</a>\n' +
        '        </div>\n' +
        '    </div>'
}

for (mech of mechanics) {
    var str = createMechCard(mech);
    var d1 = document.getElementById('mech_list');
    d1.insertAdjacentHTML('beforeend', str);
}