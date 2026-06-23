# 👤 Personenverwaltung mit Statistik

> **Titel:** Personenverwaltung mit Statistik
>
> **Zweck:** Arbeiten mit Klassen, Objekten, Listen, Methoden und Zeichenketten in Java

---

## 📋 Projektinformationen

| Feld | Inhalt |
|------|-------|
| **Projektname** | Personenverwaltung |
| **Typ** | Schulprojekt |
| **Klasse** | 1aAPC |
| **Schuljahr** | 2025/26 |
| **Abgabedatum** | 23.06.2026 |
| **Autor** | Rößmann Eva |
| **Lehrer** | G. Jarz |
| **Fach** | Applikationsentwicklung |

---

## 🎯 Projektbeschreibung

Dieses Projekt demonstriert die Verwendung von Klassen, Objekten, Listen und Zeichenketten in Java.

Es können Personen mit ihren Adressdaten erfasst und gespeichert werden. Zusätzlich wird für jede Person eine Punktezahl gespeichert.

Über ein Menü können Personen eingegeben, ausgegeben und statistisch ausgewertet werden.

---

## 📚 Aufgabe 1 – Zeichenketten

Eine Zeichenkette (String) ist eine Folge von Zeichen wie Buchstaben, Zahlen oder Sonderzeichen.

Beispiele:

```java
String name = "Eva";
String ort = "Wien";
```

### Wichtige String-Methoden

| Methode | Beschreibung |
|----------|-------------|
| `length()` | Gibt die Länge eines Strings zurück |
| `toUpperCase()` | Wandelt alle Buchstaben in Großbuchstaben um |
| `toLowerCase()` | Wandelt alle Buchstaben in Kleinbuchstaben um |
| `charAt()` | Liefert ein Zeichen an einer bestimmten Position |
| `substring()` | Gibt einen Teil eines Strings zurück |
| `equals()` | Vergleicht zwei Strings |
| `contains()` | Prüft, ob ein Text enthalten ist |

---

## 🛠️ Funktionen

### Menü

1. Person eingeben
2. Personen ausgeben
3. Statistik anzeigen
4. Programm beenden

### Erfasste Daten

- Vorname
- Nachname
- PLZ
- Ort
- Straße
- Hausnummer
- Punktezahl

### Statistik

- Durchschnittliche Punktezahl
- Höchste Punktezahl
- Niedrigste Punktezahl

---

## 🛠️ Entwicklungsumgebung

### Verwendete Software & Tools

| Tool / Software | Version | Zweck |
|---|---|---|
| **IntelliJ IDEA** | 2025.3.4.1 | Code-Editor & IDE |
| **Java SDK** | 21+ | Programmiersprache |
| **Terminal/Console** | - | Programmausführung |

### 💻 Betriebssystem

- ✅ Windows 11
- ✅ macOS
- ✅ Linux

---

### 📊 Beispiel-Ausführung

```
===== MENÜ =====
1. Person eingeben
2. Personen ausgeben
3. Statistik
4. Ende

Auswahl: 1

Vorname: Eva
Nachname: Rößmann
PLZ: 4020
Ort: Linz
Straße: Hauptstraße
Hausnummer: 10
Punkte: 85

Person gespeichert.
```

---

### 🔍 Detaillierte Code-Analyse

| Code-Element | Erklärung |
|---|---|
| `class Person` | Eigene Klasse für Personen |
| `ArrayList<Person>` | Liste für mehrere Personen |
| `personen.add()` | Person zur Liste hinzufügen |
| `for (Person person : personen)` | Alle Personen durchlaufen |
| `switch` | Menüsteuerung |
| `Scanner` | Benutzereingaben |
| `double durchschnitt` | Durchschnitt berechnen |
| `if` | Höchste und niedrigste Punkte ermitteln |

---

## 📚 Verwendete Java-Konzepte

- Klassen
- Objekte
- Methoden
- ArrayList
- Scanner
- Schleifen
- Verzweigungen
- Strings
- Statistische Berechnungen

---

## 📜 Lizenz

Dieses Projekt wurde im Rahmen des Schulunterrichts erstellt.

```
Copyright © 2026 Rößmann Eva
Schulprojekt - rdata GmbH
Nicht für kommerzielle Nutzung vorgesehen
```

---
