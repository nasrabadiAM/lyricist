package cafe.adriel.lyricist.sample.multimodule.strings

import cafe.adriel.lyricist.LyricistStrings

@LyricistStrings(languageTag = "en", default = true)
val EnMultiModuleStrings = MultiModuleStrings(
    string = "Hello Compose!"
)
