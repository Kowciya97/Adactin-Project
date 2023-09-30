//<reference types='cypress'/>

describe("Adactin Hotel App Overall Functionality", function () {

    // TestCase - 1
    it('User Should be able o Book the Hotel-> Entire Booking process', function () {
        cy.visit('https://adactinhotelapp.com/');

        // Login Functionality
        cy.get('#username').type("kowciya97");
        cy.get('#password').type("C53LLE");
        cy.get('#login').click({ multiple: true });
        cy.wait(2000);

        // Search Hotel Functionality
        cy.get('#location').select("Melbourne").should('have.value', "Melbourne");
        cy.get("select[name='hotels']").select("Hotel Sunshine").should('have.value', "Hotel Sunshine");
        cy.get("select[name='room_type']").select("Double").should('have.value', "Double");
        cy.get("select[name='room_nos']").select("2 - Two").should('have.value', "2");
        cy.get('#datepick_in').clear().type("25/09/2023");
        cy.get('#datepick_out').clear().type("28/09/2023");
        cy.get('#adult_room').select("2 - Two").should('have.value', "2");
        cy.get('#child_room').select("1 - One").should('have.value', "1");
        cy.get('#Submit').click();
        cy.wait(2000);

        // Select Hotel Functionality
        cy.get('#radiobutton_0').click();
        cy.xpath("//input[@id='continue']").click();
        cy.wait(1500);

        // Booking Hotel Functionlaity
        cy.xpath("//input[@id='first_name']").type("Kowciya");
        cy.xpath("//input[@id='last_name']").type("Seenivasa");
        cy.xpath("//textarea[@id='address']").type("46, Kiraama Savadi Stree, Cumbum-625516");
        cy.xpath("//input[@id='cc_num']").type("3333666677778888");
        cy.xpath("//select[@id='cc_type']").select("American Express").should('have.value', "AMEX");
        cy.xpath("//select[@id='cc_exp_month']").select("February").should('have.value', 2);
        cy.xpath("//select[@id='cc_exp_year']").select("2012").should('have.value', 2012);
        cy.xpath("//input[@id='cc_cvv']").type("212");
        cy.xpath("//input[@id='book_now']").click();
        cy.wait(1000);

        // Booking Confirmation Functionality
        cy.xpath("//input[@id='my_itinerary']").click();
        cy.xpath("//input[@id='order_id_text']").type("AO75G6X629R");
        cy.xpath("//input[@id='search_hotel_id']").click();
        cy.get("input[type='checkbox']").check().should('be.checked');
        cy.get("input[value='Cancel Selected']").click();
        cy.wait(500);
        cy.xpath("//input[@id='logout']").click();

        cy.screenshot();

    });

});