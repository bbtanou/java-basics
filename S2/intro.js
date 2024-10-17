const prescription = createPrescription();

const form = document.createElement('form');
form.appendChild(prescription);

const body = document.getElementById('body');

body.appendChild(form);

document.addEventListener('click', function(){
    const nouvelPrescription = createPrescription();
    form.appendChild(nouvelPrescription);
});



function createPrescription() {
    const prescription = document.createElement('div');
    prescription.style = 'display: flex; align-items: end; gap: 3px';


    const nom = createFormElement('Nom complet');
    const quantity = createFormElement('Quantite', 'number')
    const posologie = createFormElement('Posologie');
    const description = createFormElement('Description');

    prescription.appendChild(nom);
    prescription.appendChild(quantity);
    prescription.appendChild(posologie);
    prescription.appendChild(description);

    return prescription;
}

function createFormElement(nom, type = 'text') {
    const label = document.createElement('label');
    label.innerText = nom;
    const input = document.createElement('input')
    input.type = type;

    const div = document.createElement('div');
    div.appendChild(label);
    div.appendChild(input);

    div.style = 'display: flex; flex-direction: column'

    return div;
}
