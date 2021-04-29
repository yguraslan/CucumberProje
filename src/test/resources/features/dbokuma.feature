@dbokuma
Feature: Veri Okuma
  Scenario: kullanici hotel tablosundaki verileri okur
    Given kullanici veritabanina baglanir
    And kullanici "tHOTEL" tablosundaki "Email" verilerini alir
    And kullanici "Email" sutunundaki verileri okur