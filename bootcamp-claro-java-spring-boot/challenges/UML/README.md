# UML Modeling

This is an example of a UML diagram. For illustrative purposes, we present a generic diagram representing some functionalities of the first **iPhone**.

To ensure this is a generic example with only three functionalities to illustrate.

```mermaid
classDiagram
    class MusicPlayer {
        +play()
        +pause()
        +selectSong(song: String)
    }

    class Telephone {
        +call(number: String)
        +answer()
        +startVoicemail()
    }

    class InternetBrowser {
        +displayPage(url: String)
        +addNewTab()
        +refreshPage()
    }

    class iPhone {
        +call(number: String)
        +play()
        +displayPage(url: String)
    }

iPhone --> MusicPlayer
iPhone --> Telephone
iPhone --> InternetBrowser
```