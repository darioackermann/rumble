(:JIQS: ShouldRun; Output="({ "Language" : "Serbian", "Correct guesses" : 6, "Incorrect guesses" : 3 }, { "Language" : "Korean", "Correct guesses" : 3, "Incorrect guesses" : 3 }, { "Language" : "Somali", "Correct guesses" : 3, "Incorrect guesses" : 6 }, { "Language" : "French", "Correct guesses" : 7, "Incorrect guesses" : 1 }, { "Language" : "Assyrian", "Correct guesses" : 8, "Incorrect guesses" : 5 }, { "Language" : "Bangla", "Correct guesses" : 3, "Incorrect guesses" : 2 }, { "Language" : "Turkish", "Correct guesses" : 4, "Incorrect guesses" : 4 }, { "Language" : "Malayalam", "Correct guesses" : 5, "Incorrect guesses" : 4 }, { "Language" : "Kurdish", "Correct guesses" : 6, "Incorrect guesses" : 3 }, { "Language" : "Burmese", "Correct guesses" : 4, "Incorrect guesses" : 2 }, { "Language" : "Slovak", "Correct guesses" : 3, "Incorrect guesses" : 3 }, { "Language" : "Arabic", "Correct guesses" : 5, "Incorrect guesses" : 1 }, { "Language" : "Tongan", "Correct guesses" : 5, "Incorrect guesses" : 2 }, { "Language" : "Gujarati", "Correct guesses" : 8, "Incorrect guesses" : 2 }, { "Language" : "Dutch", "Correct guesses" : 3, "Incorrect guesses" : 2 }, { "Language" : "Bulgarian", "Correct guesses" : 3, "Incorrect guesses" : 2 }, { "Language" : "Sinhalese", "Correct guesses" : 4, "Incorrect guesses" : 5 }, { "Language" : "Japanese", "Correct guesses" : 7, "Incorrect guesses" : 1 }, { "Language" : "Czech", "Correct guesses" : 4, "Incorrect guesses" : 1 }, { "Language" : "Ukrainian", "Correct guesses" : 3, "Incorrect guesses" : 1 }, { "Language" : "Albanian", "Correct guesses" : 2, "Incorrect guesses" : 6 }, { "Language" : "Estonian", "Correct guesses" : 3, "Incorrect guesses" : 2 }, { "Language" : "Macedonian", "Correct guesses" : 3, "Incorrect guesses" : 3 }, { "Language" : "Romanian", "Correct guesses" : 7, "Incorrect guesses" : 2 }, { "Language" : "Russian", "Correct guesses" : 10, "Incorrect guesses" : 5 }, { "Language" : "German", "Correct guesses" : 7, "Incorrect guesses" : 3 }, { "Language" : "Greek", "Correct guesses" : 1, "Incorrect guesses" : 3 }, { "Language" : "Bosnian", "Correct guesses" : 2, "Incorrect guesses" : 6 }, { "Language" : "Tamil", "Correct guesses" : 5, "Incorrect guesses" : 5 }, { "Language" : "Danish", "Correct guesses" : 3, "Incorrect guesses" : 5 }, { "Language" : "Samoan", "Correct guesses" : 2, "Incorrect guesses" : 4 }, { "Language" : "Punjabi", "Correct guesses" : 7, "Incorrect guesses" : 2 }, { "Language" : "Cantonese", "Correct guesses" : 2, "Incorrect guesses" : 1 }, { "Language" : "Urdu", "Correct guesses" : 4, "Incorrect guesses" : 3 }, { "Language" : "Kannada", "Correct guesses" : 5, "Incorrect guesses" : 3 }, { "Language" : "Norwegian", "Correct guesses" : 3, "Incorrect guesses" : 1 }, { "Language" : "Armenian", "Correct guesses" : 4, "Incorrect guesses" : 4 }, { "Language" : "Farsi", "Correct guesses" : 4, "Incorrect guesses" : 2 }, { "Language" : "Malay", "Correct guesses" : 3, "Incorrect guesses" : 3 }, { "Language" : "Fijian", "Correct guesses" : 1, "Incorrect guesses" : 6 }, { "Language" : "Indonesian", "Correct guesses" : 5, "Incorrect guesses" : 4 }, { "Language" : "Hindi", "Correct guesses" : 5, "Incorrect guesses" : 6 }, { "Language" : "Tigrinya", "Correct guesses" : 2, "Incorrect guesses" : 3 }, { "Language" : "Latvian", "Correct guesses" : 5, "Incorrect guesses" : 4 }, { "Language" : "Finnish", "Correct guesses" : 3, "Incorrect guesses" : 3 }, { "Language" : "Polish", "Correct guesses" : 4, "Incorrect guesses" : 1 }, { "Language" : "Amharic", "Correct guesses" : 4, "Incorrect guesses" : 3 }, { "Language" : "Slovenian", "Correct guesses" : 3, "Incorrect guesses" : 3 }, { "Language" : "Italian", "Correct guesses" : 5, "Incorrect guesses" : 2 }, { "Language" : "Swedish", "Correct guesses" : 6, "Incorrect guesses" : 3 }, { "Language" : "Dinka", "Correct guesses" : 2, "Incorrect guesses" : 10 }, { "Language" : "Nepali", "Correct guesses" : 7, "Incorrect guesses" : 2 }, { "Language" : "Mandarin", "Correct guesses" : 8, "Incorrect guesses" : 2 }, { "Language" : "Swahili", "Correct guesses" : 1, "Incorrect guesses" : 2 }, { "Language" : "Khmer", "Correct guesses" : 8, "Incorrect guesses" : 3 }, { "Language" : "Maltese", "Correct guesses" : 6, "Incorrect guesses" : 7 }, { "Language" : "Lao", "Correct guesses" : 7, "Incorrect guesses" : 4 }, { "Language" : "Dari", "Correct guesses" : 2, "Incorrect guesses" : 2 }, { "Language" : "Hungarian", "Correct guesses" : 3, "Incorrect guesses" : 1 }, { "Language" : "Hebrew", "Correct guesses" : 10, "Incorrect guesses" : 1 })" :)
let $correct := (
    for $item in yaml-doc("../../queries/confusion_sample.yaml")
    let $guess := $item."guess", $target := $item."target"
    where $guess = $target
    group by $target
    return {"Language": $target,
"Correct guesses": count($guess)})

let $incorrect := (
for $item in yaml-doc("../../queries/confusion_sample.yaml")
let $guess := $item."guess", $target := $item."target"
where $guess != $target
group by $target
return {"Language": $target,
"Incorrect guesses": count($guess)})

for $c in $correct, $i in $incorrect
where $c."Language" = $i."Language"
return {"Language": $c."Language",
"Correct guesses": $c."Correct guesses",
"Incorrect guesses": $i."Incorrect guesses"}