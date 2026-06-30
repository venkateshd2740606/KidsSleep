package com.kidssleep.engine

import com.kidssleep.domain.model.Story
import com.kidssleep.domain.model.StoryCategory

object StoryBank {

    val all: List<Story> = listOf(
        story(
            id = 1,
            title = "The Honest Woodcutter",
            category = StoryCategory.MORAL,
            illustration = "🪓",
            lines = listOf(
                "A poor woodcutter dropped his axe into a deep river.",
                "A fairy appeared and offered a golden axe.",
                "The woodcutter said, \"That is not mine.\"",
                "She offered a silver axe, but he refused again.",
                "He only wanted his plain old wooden axe.",
                "The fairy smiled and gave him all three axes.",
                "Honesty brought him more than he ever hoped for."
            ),
            hindiTitle = "ईमानदार लकड़हारा",
            teluguTitle = "Nijayati kattada",
            tamilTitle = "நேர்மையான மரவெட்டி",
            kannadaTitle = "ಪ್ರಾಮಾಣಿಕ ಕಾಯಿಸುವವ",
            malayalamTitle = "സത്യസന്ധനായ മരംവെട്ടുകാരൻ",
            hindiLines = listOf(
                "एक गरीब लकड़हारे की कुल्हाड़ी नदी में गिर गई।",
                "एक परी ने सुनहरी कुल्हाड़ी दी।",
                "उसने कहा, \"यह मेरी नहीं है।\"",
                "चाँदी की कुल्हाड़ी भी उसने लौटा दी।",
                "उसे सिर्फ अपनी लकड़ी की कुल्हाड़ी चाहिए थी।",
                "परी ने मुस्कुराकर तीनों कुल्हाड़ियाँ दे दीं।",
                "ईमानदारी ने उसे बड़ा इनाम दिलाया।"
            ),
            teluguLines = listOf(
                "Oka kattada vadiki kodali nadilo padipoyindi.",
                "Oka devata bangaru kodali ichindi.",
                "Vadiki adi nadi kadu annadu.",
                "Vendi kodali kuda tirigi ichadu.",
                "Vadiki tana patti kodali matrame kavali.",
                "Devata navvindi, moodu kodalu ichindi.",
                "Nijayati pedda inaam techindi."
            ),
            tamilLines = listOf(
                "Oru maravetti aaril koththari vizhundhadhu.",
                "Oru devadhai thangam koththari koduththaal.",
                "Adhu enadhu alla endraan.",
                "Velli koththariyum thiruppi koduththaan.",
                "Avanukku avanudaiya koththari mattum venum.",
                "Devadhai sirikka, moondru koththariyum koduththaal.",
                "Nermai periya parisu koduththadhu."
            ),
            kannadaLines = listOf(
                "Ondu kayisuvavanige kodali nadiyalli biddu.",
                "Ondu devate swarna kodali koduthalu.",
                "Adhu nanna alla endu helidanu.",
                "Vajra kodali kooda tirigi kodidanu.",
                "Avanige avana marada kodali beku.",
                "Devate navvida, mooru kodali koduthalu.",
                "Pramanikathe dodda inaam koduthitu."
            ),
            malayalamLines = listOf(
                "Oru maravettukaranude kodali aaril veenu.",
                "Oru devatha swarna kodali thannu.",
                "Athu ente alla ennu paranj.",
                "Velli kodali kooduthirichu thannu.",
                "Avanodu avante marakkodali mathram venumayirunnu.",
                "Devatha chirichu, moonnu kodali thannu.",
                "Satyasandhatha valiya inam nalki."
            )
        ),
        story(
            id = 2,
            title = "The Lion and the Mouse",
            category = StoryCategory.PANCHATANTRA,
            illustration = "🦁",
            lines = listOf(
                "A mighty lion was sleeping in the forest.",
                "A tiny mouse ran across his nose and woke him.",
                "The angry lion caught the mouse in his paw.",
                "The mouse begged, \"Please let me go!\"",
                "The lion laughed and set the mouse free.",
                "Later hunters trapped the lion in a net.",
                "The little mouse chewed the ropes and saved him.",
                "Even the small can help the great."
            ),
            hindiTitle = "शेर और चूहा",
            teluguTitle = "Simham mariyu eluka",
            tamilTitle = "சிங்கம் மற்றும் எலி",
            kannadaTitle = "Simha mattu elu",
            malayalamTitle = "Simhamum eliyum",
            hindiLines = listOf(
                "एक बड़ा शेर जंगल में सो रहा था।",
                "एक छोटा चूहा उसकी नाक पर दौड़ा।",
                "गुस्से में शेर ने चूहे को पकड़ लिया।",
                "चूहे ने कहा, \"मुझे छोड़ दो!\"",
                "शेर हँसा और उसे छोड़ दिया।",
                "बाद में शिकारियों ने शेर को जाल में फँसाया।",
                "चूहे ने रस्सियाँ काटकर उसे बचाया।",
                "छोटा भी बड़े की मदद कर सकता है।"
            ),
            teluguLines = listOf(
                "Oka pedda simham adavilo padukunnadi.",
                "Chinna eluka mukku meeda parigettindi.",
                "Kopam lo simham elukanu pattukundi.",
                "Eluka dayachesi vidipinchu annadi.",
                "Simham navvindi, elukanu vidipinchindi.",
                "Taruvata simhamu jalam lo pattukundi.",
                "Eluka doralu katti simhamunu kapadindi.",
                "Chinna vallu kooda peddala ki sahayam chestunnaru."
            ),
            tamilLines = listOf(
                "Oru periya singam kaadil thoongi kondirundhadhu.",
                "Chinna elu mookil odi.",
                "Kopathil singam elai pidithadhu.",
                "Elu vidunga endru keedhan.",
                "Singam sirippu, elai viduththadhu.",
                "Piragu singam valaigalil sapattadhu.",
                "Elu kayirai kadithu singathai kaappadhu.",
                "Chinna periya udhavum seyyalaam."
            ),
            kannadaLines = listOf(
                "Ondu dodda simha kadiralli malagittu.",
                "Chikka elu mukake oditu.",
                "Kopadalli simha elannu hidititu.",
                "Elu bidu endu begged.",
                "Simha navvitu, elannu biditu.",
                "Nantara simha jalaalalli sikkitu.",
                "Elu doralugalannu kadithu simhannu kaapaditu.",
                "Chikka dodda uddaravannu maadabahudu."
            ),
            malayalamLines = listOf(
                "Oru valiya simham kaadil urangunnu.",
                "Cheriya elu mookil odiy.",
                "Kopatthil simham eliye pidich.",
                "Elu vidu ennu prarthich.",
                "Simham chirichu eliye vidich.",
                "Pinne simham valayil kettiy.",
                "Elu kayar kettiy simhathine rakshich.",
                "Cheriyavarkkum valiyavarkku sahayam cheyyam."
            )
        ),
        story(
            id = 3,
            title = "The Thirsty Crow",
            category = StoryCategory.PANCHATANTRA,
            illustration = "🐦",
            lines = listOf(
                "On a hot day a thirsty crow flew over the land.",
                "He found a pot with very little water at the bottom.",
                "His beak could not reach the water.",
                "He looked around and saw small pebbles nearby.",
                "One by one he dropped pebbles into the pot.",
                "The water slowly rose higher and higher.",
                "At last the crow drank and flew away happily.",
                "Clever thinking solves hard problems."
            ),
            hindiTitle = "प्यासा कौआ",
            teluguTitle = "Trishna kaki",
            tamilTitle = "தாகமுள்ள காகம்",
            kannadaTitle = "BaaDige kaage",
            malayalamTitle = "Thirsty kaakka",
            hindiLines = listOf(
                "एक गर्म दिन प्यासा कौआ उड़ रहा था।",
                "उसे एक घड़े में थोड़ा पानी मिला।",
                "उसकी चोंच पानी तक नहीं पहुँच सकती थी।",
                "उसने आसपास कंकड़ देखे।",
                "वह एक-एक कर कंकड़ घड़े में डालता रहा।",
                "पानी धीरे-धीरे ऊपर आ गया।",
                "कौए ने पानी पिया और खुशी से उड़ गया।",
                "चतुराई कठिन समस्याएँ हल करती है।"
            ),
            teluguLines = listOf(
                "Vedi roju trishna kaki egurutundi.",
                "Ginni lo konchem neeru kanipinchindi.",
                "Mukku neeru cheraleni.",
                "Daggara chinnari ralulu kanipinchayi.",
                "Oka oka ralu ginni lo veyadam modalu pettindi.",
                "Neeru melli meeda vachindi.",
                "Kaki neeru tagi santoshamga egurindi.",
                "Medha kastamaina samasyalu paristharistundi."
            ),
            tamilLines = listOf(
                "Veyil naalil thaagamulla kaagam parandhu.",
                "Kudathil konjam thanni kandadhu.",
                "Mooku thanniyai thodavillai.",
                "Pakkathil chinna kalgal kandadhu.",
                "Ora ora kal kudathil pottadhu.",
                "Thanni mella mella melai vanadhu.",
                "Kaagam thanni kudithu santhoshamaga parandhu.",
                "Medhai kadinamana tholaigalai theerkkum."
            ),
            kannadaLines = listOf(
                "Bisi dinadalli baadige kaage hariyitu.",
                "Kudiyalli swalpa neeru kanditu.",
                "Mukku neerige tudiyalilla.",
                "Hattiradalli chikka kallugalu kandavu.",
                "Ondu ondu kallannu kudiyalli haakitu.",
                "Neeru mella mele banditu.",
                "Kaage neeru kudithu santoshadinda hariyitu.",
                "Medhavi chintane kashta pariharisutte."
            ),
            malayalamLines = listOf(
                "Veyil nallil thirst kaakka parann.",
                "Kudathil kurachu vellam kand.",
                "Mookku vellathilekku etiyilla.",
                "Aradulla cheriya kalukal kand.",
                "Oru oru kal kudathil itt.",
                "Vellam dheere dheere melle vann.",
                "Kaakka vellam kudich santhoshamayi parann.",
                "Medhavi chintha prashnam theerkkum."
            )
        ),
        story(
            id = 4,
            title = "The Ant and the Grasshopper",
            category = StoryCategory.PANCHATANTRA,
            illustration = "🐜",
            lines = listOf(
                "All summer long the ant worked hard gathering food.",
                "The grasshopper sang and played in the warm sun.",
                "\"Why work so hard?\" laughed the grasshopper.",
                "The ant replied, \"Winter will come soon.\"",
                "When cold winds blew, the grasshopper had no food.",
                "He knocked on the ant's door and begged for help.",
                "The ant shared a little and taught a lesson.",
                "Prepare today for tomorrow's needs."
            ),
            hindiTitle = "चींटी और टिड्डा",
            teluguTitle = "Cheemalu mariyu eesuka",
            tamilTitle = "எறும்பு மற்றும் வெட்டுக்கிளி",
            kannadaTitle = "Iruve mattu esuka",
            malayalamTitle = "Urumbum chirakukalum",
            hindiLines = listOf(
                "पूरी गर्मी चींटी ने खाना इकट्ठा किया।",
                "टिड्डा धूप में गाता और खेलता रहा।",
                "टिड्डा हँसा, \"इतनी मेहनत क्यों?\"",
                "चींटी बोली, \"जल्दी सर्दी आएगी।\"",
                "सर्दी आई तो टिड्डे के पास खाना नहीं था।",
                "वह चींटी के दरवाजे पर मदद माँगने आया।",
                "चींटी ने थोड़ा साझा किया और सबक सिखाया।",
                "आज मेहनत करो, कल के लिए तैयार रहो।"
            ),
            teluguLines = listOf(
                "Veyyila cheemalu pagalu pani chesayi.",
                "Eesuka padutoo adukunnadi.",
                "Eesuka navvindi, enduku antha pani?",
                "Cheemalu cheppindi, cheema vastundi.",
                "Cheema vachinappudu eesukaki tinad ledu.",
                "Cheemala intiki sahayam adigindi.",
                "Cheemalu konchem ichi lesson nerpinchindi.",
                "Eeroju pani cheste repu siddham."
            ),
            tamilLines = listOf(
                "Kodai muzhuvathum erumbu pani seythadhu.",
                "Vettukkili paadi vilaiyaadinaal.",
                "Vettukkili sirippu, enna ippadi pani?",
                "Erumbu sonnadhu, koodu varum.",
                "Koodu vandhaal vettukkili unavu illai.",
                "Erumbu veetil udhavi keedhan.",
                "Erumbu konjam koduthu padam kattinaal.",
                "Inru thayaar, naalai thevai."
            ),
            kannadaLines = listOf(
                "Baisagadalli iruve kastapattu aharisalu.",
                "Esuka haaduthu aaditu.",
                "Esuka navvitu, yaake itna kasta?",
                "Iruve helitu, cheele barutte.",
                "Cheele bandaga esukakke aharavilla.",
                "Iruve manege sahaya begged.",
                "Iruve swalpa koduthu lesson kalithitu.",
                "Ivattu tayari, naalege beku."
            ),
            malayalamLines = listOf(
                "Veettil muzhuvan urumbu aharam sangrahich.",
                "Chirakukaal paadi kalich.",
                "Chirakukaal chirich, enthina ivale prayaasam?",
                "Urumbu paranj, cheela varum.",
                "Cheela vannappol chirakukalkku bhakshanam illayirunnu.",
                "Urumbinte veettil sahayam thetti.",
                "Urumbu kurachu nalki padam padippich.",
                "Innu thayarikkuka, naale venda."
            )
        ),
        story(
            id = 5,
            title = "The Golden Goose",
            category = StoryCategory.FOLK,
            illustration = "🪿",
            lines = listOf(
                "A kind farmer shared his bread with a hungry old man.",
                "The old man gave him a goose that laid golden eggs.",
                "Each morning a shining golden egg appeared.",
                "The farmer grew rich but also greedy.",
                "He thought the goose must hold many eggs inside.",
                "He cut the goose open to get them all at once.",
                "No eggs were found, and the magic goose was gone.",
                "Greed can destroy the good things we have."
            ),
            hindiTitle = "सुनहरी हंस",
            teluguTitle = "Bangaru batuku",
            tamilTitle = "தங்க வாத்து",
            kannadaTitle = "Swarna hamsa",
            malayalamTitle = "Swarna thara",
            hindiLines = listOf(
                "एक किसान ने भूखे बूढ़े आदमी को रोटी दी।",
                "बूढ़े ने उसे सुनहरी अंडे देने वाली हंस दी।",
                "हर सुबह एक सुनहरा अंडा मिलता।",
                "किसान अमीर हुआ पर लालची भी बन गया।",
                "उसने सोचा हंस के अंदर बहुत अंडे हैं।",
                "उसने हंस को काट दिया।",
                "कोई अंडा नहीं मिला, जादुई हंस चली गई।",
                "लालच अच्छी चीज़ें नष्ट कर देता है।"
            ),
            teluguLines = listOf(
                "Oka raitu aakali vachina vaddiki roti ichadu.",
                "Vadiki bangaru guddu pede batuku ichadu.",
                "Prati roju oka bangaru guddu vastundi.",
                "Raitu dhanavantudu ayyadu, aasha kooda perigindi.",
                "Batuku lopala chala guddlu unnayi ani anukunnadu.",
                "Batuku ni katti chusadu.",
                "Guddu ledu, magic batuku poyindi.",
                "Aasha manam unna manchidi nashtam chestundi."
            ),
            tamilLines = listOf(
                "Oru vivasayi pasikka vandha vathiyarkku roti koduththaan.",
                "Vathiyar thangam muttai veyum vaththai koduththaar.",
                "Ovvoru kaalaiyil oru thangam muttai.",
                "Vivasayi selvam periya, aasaiyum periyadhu.",
                "Vaththai ullae muttaigal irukkum endru ninaiththaan.",
                "Vaththai vettinaan.",
                "Muttai illai, magic vaththu poiyadhu.",
                "Aasai nalla vishayathai nashtam seyyum."
            ),
            kannadaLines = listOf(
                "Ondu raita hasivada hudugarige roti koduthanu.",
                "Hudugaru swarna motte haki hamsa koduthanu.",
                "Prati belige ondu swarna motte.",
                "Raita dhanavanta aad, aashe kooda hechchitu.",
                "Hamsada olage mottegalu iddave endu anisitu.",
                "Hamsavannu kattidanu.",
                "Motte illavilla, magic hamsa hoditu.",
                "Aashe nammalli iruva manchadannu nashtamaduttade."
            ),
            malayalamLines = listOf(
                "Oru krishiyan vishakkunna vayidhanekku roti nalki.",
                "Vayidhan swarna mutta veyum thara thannu.",
                "Prathi prabhatham oru swarna mutta.",
                "Krishiyan dhanavante aayi, aasha kooduthi.",
                "Tharayude ullil muttakal undo ennu thonniy.",
                "Tharaye vettiy.",
                "Mutta kandilla, magic thara poyi.",
                "Aasha nammude nallath nashtappeduthum."
            )
        ),
        story(
            id = 6,
            title = "The Tortoise and the Hare",
            category = StoryCategory.PANCHATANTRA,
            illustration = "🐢",
            lines = listOf(
                "A speedy hare laughed at a slow tortoise.",
                "They agreed to race across the meadow.",
                "The hare dashed ahead and took a long nap.",
                "He dreamed of winning while the tortoise kept walking.",
                "Step by step the tortoise passed the sleeping hare.",
                "When the hare woke up, the tortoise was near the finish.",
                "The hare ran fast but could not catch up.",
                "Slow and steady wins the race."
            ),
            hindiTitle = "कछुआ और खरगोश",
            teluguTitle = "Tabelu mariyu kollu",
            tamilTitle = "ஆமை மற்றும் முயல்",
            kannadaTitle = "Aame mattu mola",
            malayalamTitle = "Aamayum mola",
            hindiLines = listOf(
                "तेज़ खरगोश ने धीमे कछुए का मज़ाक उड़ाया।",
                "दोनों ने दौड़ लगाने का फैसला किया।",
                "खरगोश आगे भागा और सो गया।",
                "कछुआ धीरे-धीरे चलता रहा।",
                "कछुआ सोते खरगोश के पास से निकल गया।",
                "खरगोश जागा तो कछुआ लक्ष्य के पास था।",
                "खरगोश दौड़ा पर जीत न सका।",
                "धीरे और लगातार चलने वाला जीतता है।"
            ),
            teluguLines = listOf(
                "Vegamaina kollu nidiga tabelu navvindi.",
                "Ivvaramu parugula pote chesukunnaru.",
                "Kollu munduku parigetti padukundi.",
                "Tabelu melli adutoo vachindi.",
                "Tabelu padukunna kollu daggaraki vachindi.",
                "Kollu lechi chusindi, tabelu finish daggaralo undi.",
                "Kollu parigetti kani gelavalekapoyindi.",
                "Melli mariyu sthiranga nadiche vadu gelustadu."
            ),
            tamilLines = listOf(
                "Vegamana muyal aamaiyai sirippu.",
                "Orendu parisai oda thayar aanaar.",
                "Muyal mun selli thoonginaan.",
                "Aamai mella mella nadanthadhu.",
                "Aamai thoongum muyal pakka vandhadhu.",
                "Muyal ezhunthaal aamai finish pakkam.",
                "Muyal odi pidikkavillai.",
                "Mellaum thodarbana nadai veetri."
            ),
            kannadaLines = listOf(
                "Vega mola nidiga aameyannu navvitu.",
                "Ivaru odakke thammannu.",
                "Mola mundakke odithu malagitu.",
                "Aame mella nadeditu.",
                "Aame malagida mola hatra banditu.",
                "Mola ezhadidaaga aame finish hatra.",
                "Mola odithu sertalilla.",
                "Mella mattu sthiravagi naduvavaru gelluttare."
            ),
            malayalamLines = listOf(
                "Vegamulla mola aamaye chirich.",
                "Randu perum odakku thammann.",
                "Mola mun odiy urangiy.",
                "Aama dheere nadann.",
                "Aama urangunna mola aduthu vann.",
                "Mola ezhunnapol aama finish aduthu.",
                "Mola odiy pidikkilla.",
                "Dheere sthiramayi nadannavan jayikkum."
            )
        ),
        story(
            id = 7,
            title = "The Boy Who Cried Wolf",
            category = StoryCategory.MORAL,
            illustration = "🐺",
            lines = listOf(
                "A young shepherd watched his sheep on the hill.",
                "He shouted, \"Wolf! Wolf!\" though no wolf was there.",
                "Villagers ran to help and found only laughing boys.",
                "He did it again for fun, and people came once more.",
                "One evening a real wolf crept toward the flock.",
                "The boy cried loudly, but no one believed him.",
                "The wolf chased the sheep before help arrived.",
                "Always tell the truth, or people stop trusting you."
            ),
            hindiTitle = "भेड़िया आया वाला लड़का",
            teluguTitle = "Teda pilichina abbayi",
            tamilTitle = "ஓநாய் வந்தது என்ற சிறுவன்",
            kannadaTitle = "Nari banda endu helida huduga",
            malayalamTitle = "Kurukkan vann ennu paranj kutti",
            hindiLines = listOf(
                "एक लड़का पहाड़ पर भेड़ों की रखवाली करता था।",
                "उसने चिल्लाया, \"भेड़िया! भेड़िया!\" पर कोई नहीं था।",
                "गाँव वाले दौड़े और उसे हँसते पाया।",
                "उसने मज़े के लिए फिर चिल्लाया।",
                "एक शाम असली भेड़िया आया।",
                "लड़का चिल्लाया, पर कोई विश्वास नहीं किया।",
                "भेड़िया भेड़ों को भगा ले गया।",
                "सच बोलो, वरना लोग विश्वास नहीं करेंगे।"
            ),
            teluguLines = listOf(
                "Oka abbayi kondapai gorrelanu choostunnadu.",
                "Teda teda ani arichadu, kani teda ledu.",
                "Grama vallu parigetti navvutunna abbayini chusaru.",
                "Malli adukodaniki arichadu.",
                "Oka sandhya nijamaina teda vachindi.",
                "Abbayi arichadu, kani evaru nammale.",
                "Teda gorrelanu vellindi.",
                "Nijam cheppu, lekapothe nammaru."
            ),
            tamilLines = listOf(
                "Oru payan malaiyil aadugalai kaathaan.",
                "Onai onai endru koorinaan, onai illai.",
                "Oor makkal odi vanthaar, payan sirippu.",
                "Malli vilaiyaadave koorinaan.",
                "Oru maalai nijamana onai vandhadhu.",
                "Payan koorinaan, yaarum nambavillai.",
                "Onai aadugalai thurathiyadhu.",
                "Unmai sollu, illai endral nambamattanga."
            ),
            kannadaLines = listOf(
                "Ondu huduga bettadalli kurisugalannu noduttiddanu.",
                "Nari banda endu kooridanu, nari illavilla.",
                "Ooru janaru odibandu navvuttidda huduganannu kandaru.",
                "Malli aadalu kooridanu.",
                "Ondu sanje nijavada nari banditu.",
                "Huduga kooridanu, yaaru nambalilla.",
                "Nari kurisugalannu hodeditu.",
                "Satya heli, illadre nambuvudilla."
            ),
            malayalamLines = listOf(
                "Oru kutti malayil aadukale kaathirunn.",
                "Kurukkan vann ennu kooriy, kurukkan illayirunnu.",
                "Grama kar odiy vann, kutti chirichu kand.",
                "Veendum kalichaan ennu kooriy.",
                "Oru sandhya nijamaya kurukkan vann.",
                "Kutti kooriy, aarum viswasichilla.",
                "Kurukkan aadukale oodich.",
                "Sathyam parayu, illenkil viswasikkilla."
            )
        ),
        story(
            id = 8,
            title = "The Fox and the Grapes",
            category = StoryCategory.PANCHATANTRA,
            illustration = "🦊",
            lines = listOf(
                "A hungry fox saw ripe grapes hanging high on a vine.",
                "He jumped again and again but could not reach them.",
                "He tried from every side until he grew tired.",
                "His mouth watered as he stared at the purple fruit.",
                "At last he walked away with his nose in the air.",
                "\"Those grapes are probably sour anyway,\" he said.",
                "He pretended not to care about what he could not get.",
                "Do not blame things when you fail to reach them."
            ),
            hindiTitle = "लोमड़ी और अंगूर",
            teluguTitle = "Nakkalu mariyu draksha",
            tamilTitle = "நரி மற்றும் திராட்சை",
            kannadaTitle = "Nari mattu drakshi",
            malayalamTitle = "Nariyum munthiriyum",
            hindiLines = listOf(
                "एक भूखी लोमड़ी ने ऊँचे अंगूर देखे।",
                "वह बार-बार कूदी पर पहुँच न सकी।",
                "वह हर तरफ से कोशिश करती रही।",
                "अंगूर देखकर उसके मुँह में पानी आया।",
                "अंत में वह नाक ऊँची कर चल दी।",
                "उसने कहा, \"ये अंगूर खट्टे होंगे।\"",
                "जो न मिले उसे वह अनदेखा करने लगी।",
                "न मिलने पर दोष दूसरों पर मत डालो।"
            ),
            teluguLines = listOf(
                "Aakali nakkalu etu draksha pandlu chusindi.",
                "Malli malli egurindi, cheraleni.",
                "Anni vaipula prayatnam chesindi.",
                "Draksha chusi aakali perigindi.",
                "Chivariki mukham etu tirigi vellindi.",
                "Draksha pulupu ga untayi ani annadi.",
                "Dorakani danini pattinchukole.",
                "Sadhinchalekapote vere vallani doshinchaku."
            ),
            tamilLines = listOf(
                "Pasikka nari melae irukkum dratchai kandadhu.",
                "Malli malli koodinaal, etavillai.",
                "Ella pakkamum muyarchi seythadhu.",
                "Dratchai paarthu pasikkai periyadhu.",
                "Kadasaikil mookai mel thirumbi sendradhu.",
                "Dratchai pulippu endru sonnadhu.",
                "Kidaikkatha porulai marandhu poiyadhu.",
                "Sadhikkaamalanaal verai thittavendum."
            ),
            kannadaLines = listOf(
                "Hasida nari mele drakshi hannugala noditu.",
                "Malli malli kooditu, tudiyalilla.",
                "Ella bagilinda prayatna maditu.",
                "Drakshi nodi hasike hechchitu.",
                "Antyadalli mukha mele tirugi hoditu.",
                "Drakshi huli endu helitu.",
                "Sigada danagalannu paravagilla endu natakke.",
                "Sadhisalilla endre bereyavarannu dosha maadabedi."
            ),
            malayalamLines = listOf(
                "Vishakkunna nari mukalile munthiri kand.",
                "Maramaram koodiyilla.",
                "Ellaa bhagathum shramich.",
                "Munthiri kandappol vishakam periy.",
                "Avasaanam mooku uyarthi nadann.",
                "Munthiri pulippanu paranj.",
                "Kittathathine pattikondilla ennu nadanju.",
                "Sadhikkilla enkil vere aaline kuttikkalle."
            )
        ),
        story(
            id = 9,
            title = "The Farmer and the Snake",
            category = StoryCategory.PANCHATANTRA,
            illustration = "🐍",
            lines = listOf(
                "On a cold morning a farmer found a frozen snake.",
                "He felt sorry and warmed it in his coat.",
                "The snake slowly woke and uncoiled.",
                "Instead of thanks it bit the farmer's hand.",
                "The farmer cried out in pain and surprise.",
                "\"I saved your life!\" he shouted at the snake.",
                "The snake slithered away into the grass.",
                "Kindness to the cruel may bring harm."
            ),
            hindiTitle = "किसान और साँप",
            teluguTitle = "Raitu mariyu paamu",
            tamilTitle = "விவசாயி மற்றும் பாம்பு",
            kannadaTitle = "Raita mattu haavu",
            malayalamTitle = "Krishiyanum paambum",
            hindiLines = listOf(
                "ठंडी सुबह एक किसान ने जमे हुए साँप को देखा।",
                "उसे दया आई और उसने साँप को गर्म किया।",
                "साँप धीरे जागा और हिलने लगा।",
                "धन्यवाद की जगह उसने किसान को काट लिया।",
                "किसान दर्द से चिल्लाया।",
                "उसने कहा, \"मैंने तुम्हारी जान बचाई!\"",
                "साँप घास में फिसलकर चला गया।",
                "क्रूर पर दया हानि ला सकती है।"
            ),
            teluguLines = listOf(
                "Chali roju raitu merisi paamu chusadu.",
                "Dayachesi paamu ni vodalo vedi chesadu.",
                "Paamu melli lechi untundi.",
                "Dhanyavadam badulu raitu cheyyi kuttindi.",
                "Raitu noppito arichadu.",
                "Nee jeevam kapadannanu annadu.",
                "Paamu pula loki vellindi.",
                "Kroorulanu daya cheste nashtam vastundi."
            ),
            tamilLines = listOf(
                "Koodu kaalai vivasayi merindha paambai kandadhu.",
                "Dayaiyodu paambai veppam seythaan.",
                "Paambu mella ezhunthadhu.",
                "Nandri badil paambu kai kadithadhu.",
                "Vivasayi valiyaal arichaan.",
                "Un uyirai kaappadthen endraan.",
                "Paambu pulathil sendradhu.",
                "Kroorarkalai dayai seythaal theevrai varum."
            ),
            kannadaLines = listOf(
                "Chennagi raita merida haavannu kandanu.",
                "Dayeyinda haavannu baayiyalli belesidanu.",
                "Haavu mella ezhaditu.",
                "Dhanyavadakke badalige raitana kai kadithu.",
                "Raita novvind kooridanu.",
                "Ninna jeevana kaapadidde endu helidanu.",
                "Haavu hullugalalli hariyitu.",
                "Kroorarige daye madidare nashte barabahudu."
            ),
            malayalamLines = listOf(
                "Thanupulla prabhatham krishiyan merinja paambine kand.",
                "Dayayode paambine veshathil veppich.",
                "Paambu dheere ezhunna.",
                "Nanni badal krishiyude kayyil kadich.",
                "Krishiyan vedanayode kooriy.",
                "Ninte jeevan rakshich ennu paranj.",
                "Paambu pulathilekku odiy.",
                "Kroorarkalkku daya cheythal nashtam varum."
            )
        ),
        story(
            id = 10,
            title = "The Bundle of Sticks",
            category = StoryCategory.MORAL,
            illustration = "🪵",
            lines = listOf(
                "An old father had three strong sons who often quarreled.",
                "He gave each son a single stick to break.",
                "Each stick snapped easily in their hands.",
                "Then he tied many sticks into one tight bundle.",
                "None of the sons could break the bundle together.",
                "The father said, \"Alone you are weak.\"",
                "\"Together you are strong like this bundle.\"",
                "Unity makes a family hard to break."
            ),
            hindiTitle = "लकड़ियों का गट्ठर",
            teluguTitle = "Kattalu kattam",
            tamilTitle = "விறகுகளின் கட்டு",
            kannadaTitle = "Kattigala kattu",
            malayalamTitle = "Kattikalude kattu",
            hindiLines = listOf(
                "एक बूढ़े पिता के तीन बेटे झगड़ते रहते थे।",
                "उसने हर बेटे को एक लकड़ी तोड़ने को दी।",
                "हर लकड़ी आसानी से टूट गई।",
                "फिर उसने कई लकड़ियाँ एक गट्ठर में बाँधीं।",
                "कोई भी गट्ठर न तोड़ सका।",
                "पिता बोले, \"अकेले तुम कमज़ोर हो।\"",
                "\"साथ मिलकर तुम मज़बूत हो।\"",
                "एकता परिवार को मज़बूत बनाती है।"
            ),
            teluguLines = listOf(
                "Moodu kodukulu eppudu godava padutunnaru.",
                "Tandri oka oka kattani ichadu.",
                "Prati kattalu suluvuga virigipoyayi.",
                "Taruvata chala kattalu kattam chesadu.",
                "Evaru kattam viravalekapoyaru.",
                "Tandri annadu, okkare balaheenam.",
                "Kalsi unte balavantulu.",
                "Okkakatam kutumbam balam istundi."
            ),
            tamilLines = listOf(
                "Moonru maganigal eppozhum sandai.",
                "Thandai oru virakku koduththaar.",
                "Virakku sulabamaga udaithadhu.",
                "Piragu virakugalai kattu pottar.",
                "Yaarum kattai udaikkavillai.",
                "Thandai sonnaar, thani dhaanbalam illai.",
                "Koodi irundhaal balam.",
                "Orumaippu kudumbathai valamaakkum."
            ),
            kannadaLines = listOf(
                "Mooru makkalu yavagalu jagala.",
                "Tande ondu kattige koduthanu.",
                "Prati kattige sulabhavagi muriditu.",
                "Nantara halavu kattigala kattu madidanu.",
                "Yaaru kattannu muriyalilla.",
                "Tande helidanu, obbara bala illi.",
                "Ondagi iddare balavantaru.",
                "Ekya kutumbavannu balavantamaduttade."
            ),
            malayalamLines = listOf(
                "Moonnu makanmar eppozhum vazhakk.",
                "Achan oru kattu thannu.",
                "Kattu eluppam murinj.",
                "Pinne kattukal kettiy kattu undakkiy.",
                "Aarum kattu muriyilla.",
                "Achan paranj, thanne durbalam.",
                "Koode undenkil balavante.",
                "Ekathwam kudumbathe balavante aakkum."
            )
        ),
        story(
            id = 11,
            title = "The Milkmaid and Her Pail",
            category = StoryCategory.MORAL,
            illustration = "🥛",
            lines = listOf(
                "A milkmaid carried a pail of milk on her head.",
                "She dreamed of selling milk and buying eggs.",
                "The eggs would hatch into chickens she could sell.",
                "With the money she would buy a pretty dress.",
                "She tossed her head proudly at the thought.",
                "The pail tipped and all the milk spilled out.",
                "Her daydreams vanished with the milk on the ground.",
                "Do not count your gains before they are real."
            ),
            hindiTitle = "दूधवाली और उसका बाल्टी",
            teluguTitle = "Paalu ammayi mariyu paatu",
            tamilTitle = "பால்காரி மற்றும் பானை",
            kannadaTitle = "Halu hudugi mattu paatre",
            malayalamTitle = "Paal ammayum paathramum",
            hindiLines = listOf(
                "एक दूधवाली सिर पर दूध की बाल्टी लेकर चली।",
                "उसने दूध बेचकर अंडे खरीदने का सपना देखा।",
                "अंडों से मुर्गे होंगे, वे भी बिकेंगे।",
                "पैसों से वह सुंदर पोशाक खरीदेगी।",
                "वह गर्व से सिर हिलाई।",
                "बाल्टी गिरी और सारा दूध बिखर गया।",
                "उसके सपने भी ज़मीन पर बिखर गए।",
                "हाथ में आने से पहले लाभ गिनो मत।"
            ),
            teluguLines = listOf(
                "Paalu ammayi talapai paatu techindi.",
                "Paalu ammukoni guddlu konukovali ani anukundi.",
                "Guddlu kollu avutayi, avi kooda ammukovali.",
                "Dabbulu tho sundara dress konukovali.",
                "Gauravam tho talanu tolindi.",
                "Paatu padipoyi paalu challindi.",
                "Ame swapnalu kooda poyayi.",
                "Sadhinchakamunde labham ganakudadadu."
            ),
            tamilLines = listOf(
                "Paal kaari thalaiyil paanai eduthu sendraal.",
                "Paal vittu muttai vaangum kanavu.",
                "Muttai kozhi aagum, adhaiyum vikkalaam.",
                "Panathil sundara dress vaangalaam.",
                "Perumaiyil thalaiyai aattinaal.",
                "Paanai vizhundhu paal challiyadhu.",
                "Kanavugalum poiyadhu.",
                "Kaivaruvathukku munbu labam ennaadha."
            ),
            kannadaLines = listOf(
                "Halu hudugi taleyalli paatre tanditu.",
                "Halu madi motte konuvudu kanasu.",
                "Motte koli aagutte, adannu kooda mada.",
                "Duddu inda sundara dress konuvudu.",
                "Gauravadi taleyannu aadisitu.",
                "Paatre biddu halu challitu.",
                "Kanavugaloo hoyitu.",
                "Siguvudakke munche labha enna bedi."
            ),
            malayalamLines = listOf(
                "Paal ammayi thalathil paathram eduth nadann.",
                "Paal vittu mutta vangum swapnam.",
                "Mutta kozhi aakum, athum vittam.",
                "Panathil sundara dress vangum.",
                "Abhimaanathode thala aatti.",
                "Paathram veenu paal challi.",
                "Swapnangalum poyi.",
                "Kittunnathinu munpu labham kanakkakalle."
            )
        ),
        story(
            id = 12,
            title = "The Three Little Pigs",
            category = StoryCategory.FOLK,
            illustration = "🐷",
            lines = listOf(
                "Three little pigs each built a house of their own.",
                "One used straw, one used sticks, and one used bricks.",
                "A big bad wolf came and huffed at the straw house.",
                "The straw house fell, and that pig ran to his brother.",
                "The wolf blew down the stick house too.",
                "At the brick house the wolf huffed with all his might.",
                "The house stood firm, and the pigs were safe inside.",
                "Hard work and strong choices keep us safe."
            ),
            hindiTitle = "तीन छोटे सूअर",
            teluguTitle = "Moodu chinna pandi",
            tamilTitle = "மூன்று சிறிய பன்றிகள்",
            kannadaTitle = "Mooru chinna handi",
            malayalamTitle = "Moonnu cheriya panni",
            hindiLines = listOf(
                "तीन छोटे सूअरों ने अपने घर बनाए।",
                "एक ने घास, एक ने लकड़ी, एक ने ईंटें इस्तेमाल कीं।",
                "भेड़िया आया और घास के घर पर फूँक मारी।",
                "घर गिरा, सूअर भागा।",
                "भेड़िया ने लकड़ी का घर भी गिरा दिया।",
                "ईंट के घर पर ज़ोर से फूँका।",
                "घर डगमगाया नहीं, सूअर सुरक्षित रहे।",
                "मेहनत और मज़बूत चुनाव हमें बचाते हैं।"
            ),
            teluguLines = listOf(
                "Moodu chinna pandulu intlu kattukunnayi.",
                "Okaadi grass, okaadi kattalu, okaadi ituka.",
                "Pedda teda vachi grass inti pai uvigindi.",
                "Inti padipoyindi, pandi parigetti vellindi.",
                "Teda kattala inti kooda padipoyindi.",
                "Ituka inti pai balamga uvigindi.",
                "Inti nilabadindi, pandulu surakshitam.",
                "Kasta pani mariyu balamaina teerpukulu kapadutayi."
            ),
            tamilLines = listOf(
                "Moonru chinna pandigal veedu kattinaar.",
                "Ora pul, ora virakku, ora seengal.",
                "Periya onai vandhu pul veetai oodhinaan.",
                "Veedu vizhundhadhu, pandhi odi sendradhu.",
                "Onai virakku veetaiyum oodhinaan.",
                "Seengal veetil balamaaga oodhinaan.",
                "Veedu nindradhu, pandhigal surakshitham.",
                "Kashtamana pani namai kaappadhu."
            ),
            kannadaLines = listOf(
                "Mooru chinna handigalu mane kattidavu.",
                "Ondu hullu, ondu kattige, ondu ittugalu.",
                "Dodda nari bandu hullina manege ooditu.",
                "Mane biddu, handi oditu.",
                "Nari kattigeya maneyannu kooda bidisitu.",
                "Ittugala manege balavagi ooditu.",
                "Mane nintitu, handigalu surakshitavagi.",
                "Kasta prayatna mattu balavada teerpugalannu kaapaduttave."
            ),
            malayalamLines = listOf(
                "Moonnu cheriya pannikal veedu katti.",
                "Onnu pul, onnu kattu, onnu itta.",
                "Valiya kurukkan vann pul veetil oodiy.",
                "Veedu veenu, panni odiy.",
                "Kurukkan kattuveetum veenu.",
                "Itta veetil balamayi oodiy.",
                "Veedu nilannu, pannikal surakshitham.",
                "Prayaasamum balamaya thiranjethalum rakshikkum."
            )
        ),
        story(
            id = 13,
            title = "The Greedy Dog",
            category = StoryCategory.MORAL,
            illustration = "🐕",
            lines = listOf(
                "A dog found a juicy bone and carried it home.",
                "He crossed a bridge over a clear stream.",
                "In the water he saw another dog with a bone.",
                "He wanted that bone too and began to bark.",
                "His own bone slipped from his mouth and splashed down.",
                "The other dog was only his reflection in the water.",
                "He lost what he had while chasing more.",
                "Greed can make you lose what you already own."
            ),
            hindiTitle = "लालची कुत्ता",
            teluguTitle = "Aasha kukka",
            tamilTitle = "பேராசை நாய்",
            kannadaTitle = "Aashe naayi",
            malayalamTitle = "Aasha naayi",
            hindiLines = listOf(
                "एक कुत्ते को रसीली हड्डी मिली।",
                "वह पुल पर से नदी पार कर रहा था।",
                "पानी में उसे दूसरा कुत्ता हड्डी के साथ दिखा।",
                "वह उस हड्डी को भी चाहता था और भौंका।",
                "उसकी हड्डी मुँह से गिरकर पानी में डूब गई।",
                "दूसरा कुत्ता उसकी परछाई थी।",
                "और चाहने में उसने अपनी हड्डी खो दी।",
                "लालच से जो है वह भी जाता है।"
            ),
            teluguLines = listOf(
                "Oka kukka rasamaina emuku dorikindi.",
                "Vadiki paala meeda nadustunnadu.",
                "Neerulo inko kukka emuku tho kanipinchindi.",
                "Adi kuda kavali ani mogindi.",
                "Tana emuku notlo nundi padipoyindi.",
                "Inko kukka adi pratibimba matrame.",
                "Aasha valla tana emuku potundi.",
                "Aasha unna danini kuda kolpotam."
            ),
            tamilLines = listOf(
                "Oru nai suvaiyana elumbu kandadhu.",
                "Paalathai kadanthu sendradhu.",
                "Neeril veru nai elumbu kondiruppathu kandadhu.",
                "Adhaiyum venum endru oodhinaal.",
                "Than elumbu vaayil irundhu vizhundhadhu.",
                "Veru nai avanudaiya prathibimbam.",
                "Aasaiyal irundhadhaiyum izhandhaan.",
                "Aasai iruppathaiyum nashtam seyyum."
            ),
            kannadaLines = listOf(
                "Ondu naayi rasada moole kanditu.",
                "Setuve melinda naditu.",
                "Neerinalli bere naayi moole hodiruvudu kanditu.",
                "Adannu kooda beku endu bididanu.",
                "Tanna moole bayinda biddu.",
                "Bere naayi adara pratibimba.",
                "Aasheyinda hodiruvudannu kooda kottitu.",
                "Aashe iruvudannu nashtamaduttade."
            ),
            malayalamLines = listOf(
                "Oru naayikku rasamulla elumbu kittiy.",
                "Paalam kadann nadann.",
                "Vellathil vere naayi elumbu koode kanan.",
                "Athum venum ennu oodiy.",
                "Svantam elumbu vayil ninn veenu.",
                "Vere naayi prathibimbam mathram.",
                "Aashayal ullathum nashtappeduthi.",
                "Aasha nammude kittiyath nashtappeduthum."
            )
        ),
        story(
            id = 14,
            title = "The Clever Monkey",
            category = StoryCategory.PANCHATANTRA,
            illustration = "🐒",
            lines = listOf(
                "Two cats found a piece of cake and began to fight.",
                "A clever monkey offered to divide it fairly.",
                "He broke the cake into two uneven pieces.",
                "He took a bite from the larger piece to \"balance\" it.",
                "Then he nibbled the other side again and again.",
                "Each bite was for fairness, he claimed with a smile.",
                "Soon the whole cake was gone and only crumbs remained.",
                "Beware of those who offer help but seek their own gain."
            ),
            hindiTitle = "चतुर बंदर",
            teluguTitle = "Medhavi kothi",
            tamilTitle = "புத்திசாலி குரங்கு",
            kannadaTitle = "Medhavi kothi",
            malayalamTitle = "Medhavi kurangan",
            hindiLines = listOf(
                "दो बिल्लियों को केक मिला और वे लड़ने लगीं।",
                "एक चतुर बंदर ने बाँटने की पेशकश की।",
                "उसने केक के दो अनबराबर टुकड़े किए।",
                "बड़े टुकड़े से \"बराबर\" करने को काटा।",
                "फिर दूसरे टुकड़े से भी काटता रहा।",
                "वह मुस्कुराकर कहता, \"यह न्याय है।\"",
                "जल्द ही पूरा केक खत्म हो गया।",
                "ऐसे लोगों से सावधान जो मदद के नाम पर लाभ लें।"
            ),
            teluguLines = listOf(
                "Rendu pillalu cake doriki godava padutunnayi.",
                "Medhavi kothi samamga panchukuntanu annadi.",
                "Cake ni rendu samamaina pieces chesindi.",
                "Pedda piece nundi oka bite teesindi.",
                "Malli maro piece nundi kuda tinadam modalu pettindi.",
                "Nyaayam kosam ani navvindi.",
                "Twaraga cake antha aipoyindi.",
                "Sahayam peru meeda laabham korayevallu jagratha."
            ),
            tamilLines = listOf(
                "Irandu poonaigal cake kandu sandai.",
                "Medhavi kurangu samamaga panguven endraan.",
                "Cake irandu pangu seythaan.",
                "Periya panguvai kadithaan.",
                "Malli veru panguvaiyum kadithaan.",
                "Nyaayam endru sirippu.",
                "Seekiram cake mudindhadhu.",
                "Udhavum peyaril laabam theduvorkalai nambavendum."
            ),
            kannadaLines = listOf(
                "Eradu bekku cake kandu jagala.",
                "Medhavi kothi samavagi hanchuvenu helitu.",
                "Cake eradu bhagakke murisitu.",
                "Dodda bhagadinda ondu bite tegeditu.",
                "Matta bhagadinda kooda tinalu shuru maditu.",
                "Nyayakke endu navvitu.",
                "Bega cake mugiditu.",
                "Sahaya hesaralli laabha theduvavara jagratha."
            ),
            malayalamLines = listOf(
                "Randu poochakalkku cake kittiy, thallu.",
                "Medhavi kurangan samamayi pangu ennu paranj.",
                "Cake randu bhagam aakkiy.",
                "Valiya bhagath ninn onnu kadich.",
                "Mattu bhagathum kadich.",
                "Nyayam ennu chirich.",
                "Vegham cake kazhinju.",
                "Sahayam ennulla labham theduvarkale sradhikku."
            )
        ),
        story(
            id = 15,
            title = "The Crow and the Pitcher",
            category = StoryCategory.PANCHATANTRA,
            illustration = "🐦‍⬛",
            lines = listOf(
                "A thirsty crow flew over a dry land.",
                "He spotted a tall pitcher with water at the bottom.",
                "He tried to tip the pitcher but it was too heavy.",
                "He dropped small stones into the pitcher one by one.",
                "The water rose bit by bit with each stone.",
                "At last his beak could reach the cool water.",
                "He drank deeply and flapped his wings with joy.",
                "Patience and clever ideas can quench great thirst."
            ),
            hindiTitle = "कौआ और घड़ा",
            teluguTitle = "Kaki mariyu ginni",
            tamilTitle = "காகம் மற்றும் குடம்",
            kannadaTitle = "Kaage mattu kudike",
            malayalamTitle = "Kaakkayum kudavum",
            hindiLines = listOf(
                "एक प्यासा कौआ सूखी ज़मीन पर उड़ रहा था।",
                "उसे ऊँचा घड़ा दिखा, नीचे थोड़ा पानी था।",
                "घड़ा बहुत भारी था, वह नहीं उलट सका।",
                "उसने एक-एक कर पत्थर घड़े में डाले।",
                "हर पत्थर से पानी थोड़ा ऊपर आया।",
                "अंत में उसकी चोंच पानी तक पहुँची।",
                "उसने पानी पिया और खुशी से उड़ गया।",
                "धैर्य और चतुराई बड़ी प्यास बुझाते हैं।"
            ),
            teluguLines = listOf(
                "Trishna kaki eeta bhoomi meeda egurutundi.",
                "Etuvaaina ginni, kindha konchem neeru.",
                "Ginni bhari, vadiki tip ledu.",
                "Oka oka ralu ginni lo veyadam modalu pettindi.",
                "Prati ralu tho neeru konchem meeda vachindi.",
                "Chivariki mukku neeru cheraleni.",
                "Neeru tagi santoshamga egurindi.",
                "Sahanam mariyu medha pedda trishna teerchutundi."
            ),
            tamilLines = listOf(
                "Thaagamulla kaagam vettri bhoomiyil parandhu.",
                "Uyaramana kudam, keezh konjam thanni.",
                "Kudam bhari, thiruppa mudiyaal.",
                "Ora ora kal kudathil pottadhu.",
                "Ovvoru kalilum thanni melai vanadhu.",
                "Kadasaikil mooku thanniyai thodarnadhu.",
                "Thanni kudithu santhoshamaga parandhu.",
                "Sabanamum medhaiyum periya thaagathai theerkkum."
            ),
            kannadaLines = listOf(
                "Baadige kaage ondu oosadi bhoomiyalli hariyitu.",
                "Ettara kudike, kelagina swalpa neeru.",
                "Kudike bhari, tirupisalilla.",
                "Ondu ondu kallannu kudiyalli haakitu.",
                "Prati kallininda neeru swalpa mele banditu.",
                "Antyadalli mukku neerige tudiyitu.",
                "Neeru kudithu santoshadinda hariyitu.",
                "Sahana mattu medhavi chintane dodda baadige teerisuttade."
            ),
            malayalamLines = listOf(
                "Thirst kaakka vettu bhoomiyil parann.",
                "Uyaramulla kudam, thazhe kurachu vellam.",
                "Kudam bhari, thirichu vekkamayirunnilla.",
                "Oru oru kal kudathil itt.",
                "Oru oru kalilum vellam melle vann.",
                "Avasaanam mookku vellathilekku etiy.",
                "Vellam kudich santhoshamayi parann.",
                "Sahanaavum medhavi chinthayum valiya thirst theerkkum."
            )
        )
    )

    fun byId(id: Int): Story? = all.find { it.id == id }

    fun storyAtLevel(levelNumber: Int): Story {
        val index = (levelNumber - 1).coerceAtLeast(0) % all.size
        return all[index]
    }

    private fun story(
        id: Int,
        title: String,
        category: StoryCategory,
        illustration: String,
        lines: List<String>,
        hindiTitle: String,
        teluguTitle: String,
        tamilTitle: String,
        kannadaTitle: String,
        malayalamTitle: String,
        hindiLines: List<String>,
        teluguLines: List<String>,
        tamilLines: List<String>,
        kannadaLines: List<String>,
        malayalamLines: List<String>
    ) = Story(
        id = id,
        title = title,
        lines = lines,
        category = category,
        illustration = illustration,
        hindiTitle = hindiTitle,
        teluguTitle = teluguTitle,
        tamilTitle = tamilTitle,
        kannadaTitle = kannadaTitle,
        malayalamTitle = malayalamTitle,
        hindiLines = hindiLines,
        teluguLines = teluguLines,
        tamilLines = tamilLines,
        kannadaLines = kannadaLines,
        malayalamLines = malayalamLines
    )
}
