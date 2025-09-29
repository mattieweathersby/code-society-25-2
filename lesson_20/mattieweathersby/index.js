// ====== Rotating Gallery (show one image at a time) ======
const galleryImages = document.querySelectorAll('.gallery img');
let galleryIndex = 0;

function showGalleryImages() {
    galleryImages.forEach((img, i) => {
        img.classList.remove('active');
        if (i === galleryIndex) {
            img.classList.add('active');
        }
    });
}

// Show first image
showGalleryImages();

// Rotate automatically every 3 seconds
setInterval(() => {
    galleryIndex = (galleryIndex + 1) % galleryImages.length;
    showGalleryImages();
}, 3000);

// ====== Accordion Functionality ======
const accordionHeaders = document.querySelectorAll('.accordion-header');
accordionHeaders.forEach(header => {
    header.addEventListener('click', () => {
        // Close all accordion bodies
        document.querySelectorAll('.accordion-body').forEach(body => body.classList.remove('show'));
        // Open the clicked one
        const body = header.nextElementSibling;
        if (body) {
            body.classList.add('show');
            // Initialize tabs inside the opened accordion
            initTabs(body);
        }
    });
});

// ====== Tabbed Component Functionality ======
function initTabs(container) {
    const tabs = container.querySelectorAll('.tab');
    const tabContents = container.querySelectorAll('.tab-content');
    tabs.forEach(tab => {
        tab.onclick = () => {
            tabs.forEach(t => t.classList.remove('active'));
            tab.classList.add('active');
            tabContents.forEach(c => c.classList.remove('active'));
            const target = container.querySelector('#' + tab.dataset.tab);
            if (target) target.classList.add('active');
        };
    });
}

// Initialize tabs for any accordion body shown on page load
document.querySelectorAll('.accordion-body.show').forEach(initTabs);
