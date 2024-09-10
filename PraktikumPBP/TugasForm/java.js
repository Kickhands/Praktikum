document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('product-form');
    const category = document.getElementById('category');
    const subCategory = document.getElementById('subCategory');
    const wholesale = document.getElementById('wholesale');
    const wholesalePriceContainer = document.getElementById('wholesalePriceContainer');
    const captchaText = document.getElementById('captchaText');
    const captchaInput = document.getElementById('captcha');
    
    const errorMessages = {
        productName: document.getElementById('error-productName'),
        productDescription: document.getElementById('error-productDescription'),
        category: document.getElementById('error-category'),
        subCategory: document.getElementById('error-subCategory'),
        price: document.getElementById('error-price'),
        wholesalePrice: document.getElementById('error-wholesalePrice'),
        shippingService: document.getElementById('error-shippingService'),
        captcha: document.getElementById('error-captcha')
    };

    // Update subcategories based on selected category
    category.addEventListener('change', function () {
        let options = '';

        if (this.value === 'Baju') {
            options = '<option value="Baju Pria">Baju Pria</option>' +
                      '<option value="Baju Wanita">Baju Wanita</option>' +
                      '<option value="Baju Anak">Baju Anak</option>';
        } else if (this.value === 'Elektronik') {
            options = '<option value="Mesin Cuci">Mesin Cuci</option>' +
                      '<option value="Kulkas">Kulkas</option>' +
                      '<option value="AC">AC</option>';
        } else if (this.value === 'Alat Tulis') {
            options = '<option value="Kertas">Kertas</option>' +
                      '<option value="Map">Map</option>' +
                      '<option value="Pulpen">Pulpen</option>';
        }

        subCategory.innerHTML = options;
    });

    // Show/Hide wholesale price based on wholesale checkbox
    wholesale.addEventListener('change', function () {
        if (this.checked) {
            wholesalePriceContainer.style.display = 'block';
            document.getElementById('wholesalePrice').setAttribute('required', 'required');
        } else {
            wholesalePriceContainer.style.display = 'none';
            document.getElementById('wholesalePrice').removeAttribute('required');
        }
    });

    // Generate and display captcha
    function generateCaptcha() {
        const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz';
        let captcha = '';
        for (let i = 0; i < 5; i++) {
            captcha += characters.charAt(Math.floor(Math.random() * characters.length));
        }
        return captcha;
    }

    captchaText.textContent = generateCaptcha();

    // Validate form fields
    form.addEventListener('submit', function (event) {
        let isValid = true;

        // Validate productName
        if (form.productName.value.length < 5 || form.productName.value.length > 30) {
            errorMessages.productName.textContent = 'Nama produk harus diisi dengan benar.';
            errorMessages.productName.style.display = 'block';
            isValid = false;
        } else {
            errorMessages.productName.style.display = 'none';
        }

        // Validate productDescription
        if (form.productDescription.value.length < 5 || form.productDescription.value.length > 100) {
            errorMessages.productDescription.textContent = 'Deskripsi produk harus diisi dengan benar.';
            errorMessages.productDescription.style.display = 'block';
            isValid = false;
        } else {
            errorMessages.productDescription.style.display = 'none';
        }

        // Validate category
        if (form.category.value === '') {
            errorMessages.category.textContent = 'Kategori harus dipilih.';
            errorMessages.category.style.display = 'block';
            isValid = false;
        } else {
            errorMessages.category.style.display = 'none';
        }

        // Validate subCategory
        if (form.subCategory.value === '') {
            errorMessages.subCategory.textContent = 'Sub kategori harus dipilih.';
            errorMessages.subCategory.style.display = 'block';
            isValid = false;
        } else {
            errorMessages.subCategory.style.display = 'none';
        }

        // Validate price
        if (form.price.value === '' || form.price.value <= 0) {
            errorMessages.price.textContent = 'Harga satuan harus diisi dengan benar.';
            errorMessages.price.style.display = 'block';
            isValid = false;
        } else {
            errorMessages.price.style.display = 'none';
        }

        // Validate wholesalePrice if wholesale is checked
        if (wholesale.checked && (form.wholesalePrice.value === '' || form.wholesalePrice.value <= 0)) {
            errorMessages.wholesalePrice.textContent = 'Harga grosir harus diisi jika grosir dipilih.';
            errorMessages.wholesalePrice.style.display = 'block';
            isValid = false;
        } else {
            errorMessages.wholesalePrice.style.display = 'none';
        }

        // Validate shippingService (minimum 3 checkboxes must be selected)
        const selectedServices = document.querySelectorAll('input[name="shippingService"]:checked').length;
        if (selectedServices < 3) {
            errorMessages.shippingService.textContent = 'Pilih minimal 3 jasa kirim.';
            errorMessages.shippingService.style.display = 'block';
            isValid = false;
        } else {
            errorMessages.shippingService.style.display = 'none';
        }

        // Validate captcha
        if (form.captcha.value !== captchaText.textContent) {
            errorMessages.captcha.textContent = 'Captcha tidak sesuai!';
            errorMessages.captcha.style.display = 'block';
            isValid = false;
        } else {
            errorMessages.captcha.style.display = 'none';
        }

        // Prevent form submission if any validation fails
        if (!isValid) {
            event.preventDefault();
        }
    });
});
