@Test
Feature: Sepet Kontrol Senaryosu

  Scenario Outline: Sepet Kontrol Senaryosu
    Given Logo kontrol edildi
    And Pop up kapatildi
    And Giris yapa tiklandi
    And Giris yap secildi
    And Email girildi"<Email>"
    And Password girildi"<Password>"
    When Giris buttonuna tiklandi
    And One çikan urune tiklandi
    And Sepete eklendi
    Then Sepete gidildi
    And Sepette bir urun oldugu kontrol edilir
    And Sepetteki tum urunler silinir
    And Sepette urun kalmadigi gorulur
    Examples:
      | Email                    | Password |
      | sehirlienes443@gmail.com | 1234PAROLA |