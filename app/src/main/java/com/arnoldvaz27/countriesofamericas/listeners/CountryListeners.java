package com.arnoldvaz27.countriesofamericas.listeners;

import com.arnoldvaz27.countriesofamericas.entites.Country;

public interface CountryListeners {

    void onItemClicked(Country country, int position); //event listener after clicking on the view

}
