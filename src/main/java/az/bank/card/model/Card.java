package az.bank.card.model;

import az.bank.card.enums.CardType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    CardType cardType;
    LocalDateTime createdDate;
    String accountType;
    Currency currency;
    LocalDate expiredDate;
    int cvv;
    String cardNumber;
}
