package az.bank.card.service;

import az.bank.card.enums.CardType;

public interface CardService {
    void buyCard(String customerId, CardType cardType);
}
