document.querySelectorAll('.toggle-popup').forEach(button => {
    button.addEventListener('click', (event) => {
        const popup = document.querySelector('.popup');

        event.stopPropagation();

        if (popup.style.display === 'block') {
            popup.style.display = 'none';
        } else {
            popup.style.display = 'block';
        }
    });
});


document.addEventListener('click', (event) => {
    const popup = document.querySelector('.popup');
    const button = document.querySelector('.toggle-popup');

    if (!popup.contains(event.target) && event.target !== button) {
        popup.style.display = 'none';
    }
});
