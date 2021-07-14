package com.arnold.countriesofamericas.listeners;

import com.arnold.countriesofamericas.entites.Country;

public interface CountryListeners {

    void onItemClicked(Country country, int position); //event listener after clicking on the view

}
