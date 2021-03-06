package com.example.mi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int secilmis=0;
    int deneme_sayi =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();

        Button random = (Button) findViewById(R.id.Raandom);
        TextView random_soz = (TextView) findViewById(R.id.random_soz);
        Button goster = (Button) findViewById(R.id.gozster);
        TextView tercume = (TextView) findViewById(R.id.tercume);
        EditText baslangic = (EditText) findViewById(R.id.baslangic);
        EditText son = (EditText) findViewById(R.id.son);
        TextView dogru_cavab = (TextView) findViewById(R.id.dogru_cavab);
        TextView yalnis_cavab  =(TextView) findViewById(R.id.yalnis_cavab);
        ProgressBar bar = (ProgressBar) findViewById(R.id.progressBar);




        String hata = "lutfen buyuk rakam ve kucuk rakama dikkat ediniz";
        int hamisi = 0;
        int[] secilmis_regem = new int[500];
        ArrayList<Integer> arrayList = new ArrayList<>();

        int araliq = Integer.parseInt(son.getText().toString())-Integer.parseInt(baslangic.getText().toString());
        int deneme_sozsayi = araliq;
        int baslangic_soz = Integer.parseInt(baslangic.getText().toString());
        int son_soz = Integer.parseInt(son.getText().toString());


        String [] ingilis = new String[]{"good morning" , "good afternoon" , "good evening",
                "Goodnight "," Goodbye  ","Bye-Bye ", "Sleep well  ","Have a good / nice sleep!  "," Sweet dreams!",
                " So long! ","See you (later/soon/tomorrow)!  ","Till tomorrow!  ", "Be careful",".   Take care!  ","Look out!  ",
                "Watch out! ","Take care of yourself!  "," Good luck! ", "Have a good / nice time "," Have a good weekend","Have a good / nice journey / trip! ",
                "Bon voyage "," Have a good flight! ","Have a good holiday!  ", "Same to you!  "," Drop in anytime! "," Come to see us again!  ",
                "Cheers!-  ","Happy birthday "," Happy /Merry Christmas!- ", " Happy New Year! "," Congratulations! "," Congratulations! ",
                "Best wishes  ","Thanks "," Thanks a lot", " Thank you very (so / too) much! "," You???re welcome. ","Not at all ",
                "Don???t mention it","Please","Excuse me","Pardon me! ", "Excuse me, can you help me? ","Sorry! ","I am (really) sorry! ","Sorry? ",
                "Can (Could) you repeat that, please? ","(I???m) Nice/Glad/Pleased/Great to meet you! ","Keep in touch! ","How???re things ", "Everything is OK (Alright). ","Just the same. ","As usual / always ","Give my regards to your mother ",
                "What???s happened to you? ","actually","really","else", " around","about","approximately","approximately",
                "why not","it???s up to you","It depends on you"," I don???t mind", "It doesn???t matter ","What a pity","Hurry up! ","absolutely",
                "agree (with) ","disagree","argue (with) ","get on well (with)", "get by ","of course","confident (about) ","shy ",
                "embarrassed (about / by) ","excited (about","worried (about) ","relaxed", " comfortable ","uncomfortable ","full"," nervous ",
                "calm","patient","impatient","sad", "upset","fed up (with) ","sleepy","in pain ", "sick / ill ","hurt","hurt","hurt",
                "homesick","proud","confused ","in a good / bad ", "love","like","hate","prefer",
                "hope","want"," adore ","admire ", " can???t stand ","relative","close relative ","distant relative ",
                "distant relative ","parent","grandparent","niece", "niece","sweet daddy","an only child","in-laws ",
                "brother-in-law ","sister-in-law ","father-in-law ","mother-in-law ", "son-in-law ","daughter-in-law ","great-grandfather ","great-grandmother ",
                "twins","triplets ","maternity"," paternity ", "large family "," orphan child ","to adopt a child ","to raise a child ",
                "birth","to be born","call after","(on) birthday", "baby","toddler"," teenager","young- ",
                "adult","middle-aged","old- ","retired- ", "centenarian","be in love (with) ","fall in love (with) ","get engaged (to) ",
                "get married (to) ","get separated ","get divorced (from) "," single", "engaged (to) ","married (to) "," separated","divorced (from) ",
                "widowed","fianc??","fianc??e"," marriage ", "wedding","bride"," groom","common-law couple ","(on) honeymoon"," death ","dead",
                "to die ","funeral" ,"height","How tall are you", "tall","short- ","medium height","How heavy are you?- ",
                "weight- "," thin","skinny","slim", "  fat","plump","stout ","overweight",
                "well built ","slender ","put on/gain weight ","lose weight ", "dark","blonde/ blond ","fair ","curly",
                "straight","wavy","spiky hair ","haircut ", "short hair ","long hair ","shoulder-length hair ","bald  ",
                "wig ","hairstyle ","fringe ","ponytail ", "braid ","French braid ","bun ","skin",
                "leather","moustache ","beard","nice", "pretty ","beautiful ","gorgeous","attractive ",
                "handsome ","good-looking ","average-looking","plain ", "ugly ","fine","feel","doctor",
                "patient","heart attack- ","sick","vomit", "temperature","take medicine","tablets","hab",
                "drug","liquid","flu","dentist", "toothache","headache","get a cold","sneeze",
                "bless you","cough","asthma","fever", "malaria","cholera","cancer","healthy",
                "relax","exercise","letter ","text ", "message ","call ","have a short call","deliver",
                "line is engaged","hung up","hold on","date", "address","envelope","stamp","letter box",
                "screen","keyboard","mouse","memory stick ", "email","send","get","save",
                "spam","voicemail","speak to","take message", "call back","journey","vacation","voyage ",
                "on business","trip","travel ","package ", "flight","include ","camp","tent",
                "coach","plane","car","bus", "ferry","train","passport ","visa ",
                "ticket ","cheque","currency ","camera ", "luggage ","suitcase ","rucksack","local ",

                "food","enjoy","nightlife ","move", "place","thing","lift","elevator ",
                "key","reception","luggage","form", "hairdryer ","single room","double room","reservation",
                "view","Here you are","over there","fill", "sign","signature","to be sure","correct", "check out","service","outside line ","breakfast ",
                "lunch ","dinner ","supper ","watch ", "programme ","listen ","play ","headphones ",
                "mp3 player ","download ","chat ","cooking ", "gardening ","grow ","flower ","vegetable ",
                "novel  ","different  ","same ","magazine  ", "have someone around ","come to stay ","on the phone ",

                "be , was  ,  been","beat   ,  beat    beaten ","become    became    become","begin    began    begun",
                "bite    bit     bitten","blow     blew      blown","break    broke      broken","bring    brought       brought", "buld    built    built","burn     burned      burned","buy    bought    bought",
                "catc    caught     caught","choose    chose     chosen","come     came   come","cost    cost     cost", "cut     cut      cut","deal     dealt     dealt","do   did   done","draw    drew    drawn ",
                "dream     dreamed       dreamed ","drink    dank     drunk ","drive     droe      driven","eat    ate      eaten", "fall       fell     fallen","feel     felt     felt","fight     fought     fought","find    found     found",
                "fiy      flew        flown","forget    forgot     forgotten","forive      forgave     forgiven","reeze    froze    frozen", "get    got     got","give   gave     given ","go   went    gone","grow    grew    grown",
                "hang     hung      hung","have     had     had","hear    heard    heard","hide    hid    hidden",
                "hit    hit     hit","hold      held     held","hurt     hurt     hurt","keep    kept   kept", "know    knew     known","learn    learned     leaned","leave   left   left","lend   lent   lent",
                "let    let   let","lie   lay     lain","lose    lost      lost","make    made    made",
                "mean     meant    meant","meet   met     met","pay     paid    paid","put   put    put", "read    read     read","ride     rode    ridden","ring    rang     rung","run   ran     run",
                "say     said     said","see       saw    seen","sell      sold     sold","send     sent    sent","se    set     set",
                "shake    shook      shaken","shine     shone     shone","show     showed    shown","shut   shut   shut", "sing   sang    sung","sit    sat    sat","sleep      slept       slept","smell     smelled    smelled",
                "speak     spoke     spoken","spend     spent   spent","spell    spelt     spelt","spill     spilled       spilled",
                "stand    stood     stood","steal      stole    stolen","swim      swam     swum","take    took     taken", "teach     taught     taught","tear     tore    torn","tell    told    told","think     thought     thought",
                "throw    threw      thrown","understand       understood      understood","wake   woke   woken","wear   wore    worn",
                "win   won    won","write     wrote      written",

                "western","horror","action ","musical", "cartoon","comedy","thriller","science fiction",
                "romantic comedy","film star","director","enjoy", "boring","make a film ","take photo","sun",
                "rain","cloud","lightning","thunder", "wind","fog","snow","sunny", "rainy","windy","cloudy","snowy", "foggy","thundery","hot","cold",
                "cool","mild","degree","dry", "wet","hurricane","storm","sightseeing", "shining","lovely","horrible","warm", "train","bus","plane","railway",
                "museum","mosque","church","cathedral", "cemetery","library","town hall","pedestrian",
                "bike","van","lorry","coach", "exit","entrance","left","right", "walk","out of order","road","way",
                "take left","traffic light","turn","look for", "get on","get of","fare","fine","side",
                "stop","bridge","near ","far ", "cash machine ","bank ","motorbike ","underground ",
                "subway ","tube ","metro ","boat ", "ship ","helicopter ","map ","timetable ",
                "customs ","luggage ","passport ","reserve ", "book ","seat ","in advance","single ", "return ","arrive ","platform ","depart ",
                "leave ","car ","change ","direct ", "take off ","boarding card ","fligt attendant ","land ",
                "through ","hire ","fill ","rent ", "petrol ","mountain ","forest ","village ",
                "hill ","lake ","path ","field ", "river ","country road ","farm ","wood ",
                "cottage ","nature ","conservation ","wild ", "park ","area ","picnic ","special ",
                "festival ","Christmas ","present ","decorate ", "dance ","toast ","organization ","Easter ",
                "vary ","dress up ","knock ","sweet ", "bonfire ","fireworks ","traditional ","roast ",
                "beef ","oven ","education ","nursery ", "primary ","secondary ","state ","private ",
                "royal ","king ","queen ","political ", "decision ","Prime Minister","leader ", "criminal ",
                "robbery ","robber ","rob ","murder ", "murderer ","burglary ","burglar ","mugging ",
                "mugger ","car theft ","car thief ","steal ", "drug dealing ","drug dealer ","terrorism","terrorist ",
                "attack ","shoplifting ","shoplifter ","kidnapping ", "kidnapper ","pickpocket ","blackmail ","rape ",
                "law ","arrest ","court ","jail ", "guilty ","innocent ","prison ","cell ",
                "smash ","hooliganism ","trouble ","news ", "important ","soap opera ","story ","documentary ",
                "social ","talk show ","cartoon ","reality ", "magazine ","adverts ","persuade ","type ",
                "interview ","reporter ","journalist ","favourite ", "channel ","Whats on","repair ","break ",
                "need ","mend ","plant ","die ", "forget ","to water ","untidy  ","tidy ",
                "lose ","help ","cut ","apologise ", "to be late ","crash ","natural ","disaster ",
                "hurricane ","snowstorm ","forest fire ","earthquake ", "flood ","crowded ","poor ","homeless ",
                "unemployed ","pollution ","polluted ","war ", "earth ","dirty ","fresh ","job ",
                "independence","fight ","nationality ","to last ", "to go on ","to continue ","to carry on ","on strike ",
                "refuse ","traffic jams ","rush hour","say hello ", "tell story ","tell phone number ","tell the truth ","tell a lie ",
                "tell a joke ","ask for ","speak ","talk ", "answer ","reply ","walk ","run ",
                "jump ","dance ","swim ","climb ", "fall ","ride ","drive ","fly ",
                "pass ","carry ","miss ","catch ", "day ","week ","month ","year ",
                "fortnight ","hour ","minute ","second ", "century","yesterday","today","tomorrow",
                "evening ","afternoon ","morning ","night  ", "midnight ","season ","spring ","summer ",
                "autumn ","winter ","last ","next ", "then ","now ","later ","after ",
                "ago ","in the past  ","in the future ","always ", "usually ","often ","sometimes ","occasionally ",
                "rarely ","never ","once ","twice ", "three times ","in a moment ","at the moment","on time ", "in time ","soon ","recently ",

                "quite", "quiet","lose","loose","fell",
                "feel","cook","cooker","lend to-lend ", "borrow from","check","control","expect",
                "expect","ex-wife","half-price","informal", "impossible","pre-school-","redo","unsafe",
                "worker","swimmer","instructor","cooker", "calculator","useful","beautiful","useless",
                "endless","quickly","happily","happiness", "sadness","sandy","sunny","listen to",
                "wait for","ask for","pay for","come to", "belongs to","think about","thank for","apologise for",
                "look for","look like","look up","look forward to","look through","look out- ","look after","take after",
                "take care- ","good at","bad at","interested in", "afraid of-","proud of","great","wonderful"
                ,"excellent","dreadful","terrible","terrific", "horrible","perfect","awful","how nice",
                "how awful","kind-ka??nd ","lovely ","easy going"," intelligent ","stupid","selfish","well-behaved ",
                "naughty","","","",
                "","","",""

        };



        String []az = new String[]{
                  // 1 -
                "Sabah??n??z xeyir","G??nortan??z xeyir","Ax??am??n??z xeyir","Gec??niz xeyr??",
                "Sa?? olun. Xudahafis! Salamat qal??n","Sa?? olun. Xudahafis! Salamat qal??n.","Yax???? yuxular!","Yax???? yuxular!", "??irin yuxular!","H??l??lik! G??r??????n??d??k!","H??l??lik! G??r??????n??d??k!","Sabaha q??d??r.",
                "Ehtiyyatl?? ol!","Ehtiyyatl?? ol!","Ehtiyyatl?? ol!","Ehtiyyatl?? ol!", "??z??n?? yax???? bax!","U??urlar!","Xo?? ??yl??nc??l??r!","Xo?? h??ft?? sonu!",
                "Xo?? s??yah??t!","Xo?? s??yah??t!","Xo?? u??u??!","Xo?? t??til!", "Siz?? d??. Sizin d??","- ??st??nil??n vaxt g??lin, ba?? ????kin","Yen?? g??lin!","Sa??l????a!",
                "Ad g??n??n??z m??bar??k!","Milad bayram??n??z m??bar??k!","Yeni iliniz m??bar??k","T??brikl??r!", "??la! Af??rin!","??n xo?? arzularla","Sa?? olun. T??????kk??rl??r","??ox sa?? olun",
                "??ox sa?? olun","D??ym??z. Buyurun","D??ym??z. Buyurun","D??ym??z. Buyurun", "Z??hm??t olmasa. Buyurun","Z??hm??t olmasa. Buyurun","Z??hm??t olmasa. Buyurun","Ba??????lay??n, m??n?? k??m??k ed?? bil??rsiz?",
                "Ba??????lay??n.??zr ist??yir??m","Ba??????lay??n.??zr ist??yir??m","Nec??? N?? dediniz? ","Nec??? N?? dediniz? ", "Tan???? oldu??uma ??adam","??laq?? saxl??yaq! ","- N?? var n?? yox? ","H??r ??ey yax????d??r.",
                "El?? eyni. ??vv??lki kimi","- H??mi????ki kimi","Salamlar??m?? ??? ??atd??r??n","Siz?? n?? olub?",


                   // 2-56
                "??slind??","h??qiq??t??n","daha, ba??qa","??traf??nda, ??trafda, t??xmin??n",
                "haqq??nda, bar??d??, dair, aid,","t??xmin??n, t??xmini","h??r halda, ist??nil??n halda","niy?? d?? yox",
                "Bu s??nd??n as??l??d??r.","- Bu s??nd??n as??l??d??r.","M??n etiraz etmir??m","F??rq etmir.",
                "Heyf ki. T????ss??f","T??l??s!","tamamil??","- raz??la??maq", "raz??la??maq","m??bahis?? etm??k","yola getm??k","yola verm??k", "??lb??tt??",


                   //3-77
                "??? inaml??, arxay??n","utancaq","x??cal??tli", "h??y??canl??","narahat, nigaran, ","rahat","rahat",
                "narahat, rahat olmayan","tox, doymu??","g??rgin, ??s??bi","sakit, dinc", "s??birli, h??vs??l??li, taq??tli","s??birsiz, h??vs??l??siz, taq??tsiz","q??mgin","dilxor",
                "bezmi??, usanm????, bo??aza y??????lm????","yuxulu","a??r?? i??ind??","x??st??", " incimi??","yaln??z","a??iq, vurulmu??","evi v?? ya v??t??ni ??????n dar??xan",
                "q??rurlu, iftixarl??, m????rur","fikri qar????m????, ??a??q??n, ??a??q??n","kefi saz olan, kefi yax???? olan, ????n ","sevm??k", "b??y??nm??k","b??y??nm??","- ??st??n tutmaq, ??st??nl??k verm??k","- ??m??d etm??k", "ist??m??k","heyran olmaq","heyran olmaq","d??z?? bilm??m??k",


                   //5-111
                "qohum","yax??n qohum","uzaq qohum","??laq??", "valideyn","b??y??k valideyn","bac?? q??z??","bac??o??lu",
                "dayday","- t??k ??vlad","??r / arvad t??r??find??n qohumlar","qay??n, yezn??, bacanaq", "bald??z, elti, qarda?? arvad??","qay??nata","qay??nata","k??r??k??n",
                "g??lin","ulu baba","ulu nene","??kiz", "??????m","anal??q, anaya aid"," atal??q, ataya aid","geni?? ail??", "yetim, kims??siz u??aq","??vladl????a g??t??rm??k","u??aq b??y??tm??k, t??rbiy?? etm??k",


                  //6-  (110)--137
                " do??um", "do??ulmaq"," ad qoymaq","ad g??n??","k??rp??",
                "dil a??an u??aq","yeniyetm??","cavan","g??nc", "orta ya??l??","qoca","t??qa??d?? ????xm????","y??zya??l??",
                "a??iq olmaq, vurulmaq","a??iq olmaq, vurulmaq","ni??anlanmaq","evl??nm??k, k??bin k??sdirm??k", "ayr??lmaq","bo??anmaq"," subay","ni??anl??",
                "evli","ayr??","bo??anm????","dul", "ni??anl?? (o??lan)","ni??anl?? (q??z","evlilik, nigah, k??bin","toy",
                "g??lin","b??y","nigahs??z c??tl??k","bal ay??", "??l??m","??l??"," ??lm??k","d??fn",



                  //10-174
                "boy","Boyunuz n?? q??d??rdir?","h??nd??r","q??sa", "orta boylu","????kiniz n?? q??d??rdir?","????ki","ar??q",
                "ar??q, c??l??z","inc??","k??k","k??k", "k??k","art??q ????kili","g??vd??li","d??z qam??tli",
                "k??k??lm??k","ar??qlamaq","t??nd","sar??????n", "sar??????n","buruq","d??z","dal??al??",
                "sivri uclu sa??","sa?? k??simi","q??sa sa??","uzun sa??", "??iyin uzunlu??unda sa??","ke????l","parik","sa?? d??z??m??",
                "tel","at quyru??u ????klind?? sa?? y??????m??","h??r??k","s??nb??l h??r??k", "toppuz ","d??ri","d??ri ","b????",
                "saqqal","q??????ng, g??y????k, xo??, sevimli","q??????ng, g??y????k, xo??, sevimli","g??z??l, all??-g??ll??", "ecazkar","cazib??dar","yara????ql??","xo?? g??r??n??n, g??y????k", "orta g??r??n????l??","sad??","??irkin",


                   //11-227
                "yax????", "hiss etm??k","h??kim","x??st??","infakt",
                "x??st??","qusmaq","h??rar??t","d??rman atmaq", "d??rman","h??b","d??rman",
                "maye","qrip","di?? h??kimi","di?? a??r??s??", "ba?? a??r??s??","soyuqlamaq","asq??rmaq","- sa??lam ol",
                "??sk??m??k","asma","q??zd??rma","malyariya", "xolera","canser", "sa??lam","istirah??t","idman etm??k",



                  //15-256
                "m??ktub","m??tn","mesaj","z??ng", "vzv atmaq","??atd??r??lma","x??tt m??????uldur","d??st??yi asmaq",
                "x??tt?? g??zl??m??k","tarix","??nvan","z??rf", "m??h??r","m??ktub qutusu","ekran","klaviatura", "si??an","yadda?? ??ubu??u","po??t","g??nd??rm??k",
                "??ld?? etm??k","saxlamaq","gizli","s??sli g??nd??ri??", "dan????maq","mesaj qoymaq","geri y????maq",


                   //16- 281
                "s??f??r", "m??zuniyy??t","d??niz s??f??ri","i?? s??f??rind?? olmaq","s??yah??t",
                "s??yah??t","paketl????dirilmi??","u??u??","daxil olmaq", "d??????rg??","??ad??r","kareta","t??yyar??",
                "ma????n","avtobus","g??mi","qatar", "v??siq??","viza","bilet",
                "??ek","valyuta","kamera","y??k", "??amadan","bel ??antas??","yerli","qida", "??yl??nm??k","gec?? h??yat??","k????m??k",


                  //17-  314
                "yer", "????ya","lift","qald??r??c??","a??ar", "qeydiyyat","y??k","anket","fen",
                "t??k n??f??rlik otaq","iki n??f??rlik otaq","sifari??","g??r??n????", "Buyurun","orada","doldurmaq","imzalamaq",
                "imza","??min olmaq","d??z","yoxlamaq", "xidm??t","k??nar x??tt","s??h??r yem??yi","q??lyanalt??", "nahar","??am yem??yi",


                   //18-  340
                "baxmaq, seyr etm??k, izl??m??k","verili??","qulaq asmaq, dinl??m??k","oynamaq, ??almaq",
                "qulaqc??q","mp3 player","y??kl??m??k","s??hb??t etm??k",
                "yem??k-bi??irm??","ba??????l??q","b??y??tm??k,yeti??dirm??k, bec??rm??k","g??l",
                "t??r??v??z","roman","f??rqli, m??xt??lif","eyni",
                "jurnal","qalma??a g??lm??k","qalma??a g??lm??k","telefonda, telefonla",



                   //paasiv voice  -- 360
                "olmaq","qalib gemek","olmaq","baslamaq", "dislemek","zerbe vurmaq","qirmaq","getirmek",
                "qurmaq","yandirmaq","almaq","tutmaq", "secmek","gemek","qiymet","kesmek",
                "mesgul olmaq","etmek","cekmek","yux gormek","sicek", "surmek","yeek","dusmek","hiss etmek",
                "mubarze etmek","tapmaq","ucmaq","unutmaq", "bagislamaq","donmaq","almaq","vermek",
                "getmek","boyumek","asmaq","var omaq", "esitmek","gizletmek","vurmaq","tutmaq",
                "incitmek","saxlamaq","bilmek","oyrenmek", "buraxmaq","borc vermek","qoymaq","yalan",
                "itirmek","etmek","demek","gorusmek", "odemek","qoyma","oxumaq","surmek",
                "calmaq","qacmaq","demek","gormek", "satmaq","gondermek","qurmaq","silkelemek",
                "parlamaq","gostermek","baglamaq","oxumaq", "oturmaq","yatmaq","iylemek","danismaq",
                "xerclemek","yarmaq","tokmek","durmaq", "ogurlamaq","uzmek","almaq","oyretmek",
                "cirmaq","soylemek","dusunmek","atmaq", "anlamaq","oynamaq","geyinmek","qazanmaq", "yanmaq",

                  //22-  451
                "q??rbi","qorxulu","vuru??ma","musiqili", "cizgi filmi","komediya","triller","fantastika",
                "romantik komediya","kino ulduzu f??lm","rejissor","??yl??nm??k", "dar??xd??r??c??","film ????km??k","????kil ????km??k",

                  //24  -- 466
                "g??n????", "ya??????","bulud","??im????k","gurultu", "k??l??k","duman","qar","g??n????li", "ya??????l??","k??l??kli","buludlu","qarl??",
                "dumanl??","ild??r??m","isti","soyuq", "s??rin","m??layim","d??r??c??","quru",
                "ya??","tufan","qas??r??a","g??zm??li yerl??r", "parlaq","sevimli","qorxunc","il??q",


                    //25- 494
                "qatar","avtobus","t??yyar??","d??miryolu", "muzey","m??scid","kils??","ba?? kils??",
                "q??birsanl??q","kitabxana","h??kum??t evi","piyada", "velosiped","furqon","y??k ma????n??","vaqon",
                "????x????","giri??","sol","sa??", "g??zm??k","i??l??mir","yol","yol",
                "soldan d??n","i????qfor","d??nm??k","axtarmaq", "minm??k","d????m??k","yol pulu","c??rim??",
                "t??r??f","dayanacaq","k??rp??","yax??n", "uzaq","bankomat","bank","motosiklet",
                "metro","metro","metro","metro", "qay??q","g??mi","vertolyot","x??rit??",
                "c??dv??l","g??mr??k","y??k","v??siq??", "sifari??","sifari??","yer","??vv??lc??d??n",
                "gedi??","qay??d????","??atmaq","perron", "yola d????m??k","t??rk etm??k","ma????n","d??yi??m??k",
                "birba??a","yerd??n g??t??r??lm??k","minik kart??","st??ardessa", "yer?? enm??k","vasit??sil??","kiralamaq","doldurmaq","kiralamaq", "yanacaq",

                   //26  -  569
                "da??","me????","k??nd", "t??p??","g??l","c??????r","tarla",
                "??ay","k??nd yolu","ferma","a??acl??q", "daxma","t??bi??t","qoruq","v??h??i", "park","??razi","g??zinti",

                   //29-  587
                "x??susi", "m??rasim","Milad","h??diyy??","b??z??m??k",
                "r??qs etm??k","tost","t????kilat","pasxa", "f??rqlilik","x??susi geyinm??k","qap?? d??ym??k","??irin",
                "tonqal","at????f????anl??q","??n??n??vi","q??zard??lm????", "mal ??ti","soba","t??hsil","u??aq ba????as??",
                "ibtidai","orta","d??vl??t","??z??l", "krall??q","kral","????hzad??","siyasi", "q??rar","ba?? nazir","r??hb??r"


                  //30 --619
                ,"cinay??t", "soy??un??uluq","soy??un??u","soymaq","q??tl", "qatil","ev o??urlu??u","ev ogrusu","qapqac","qapqa??","ma????n o??urlu??u",
                "ma????n o??rusu","o??urluq","narkotik alveri","narkotik alvercisi","terror", "terrorist","h??cum","ma??aza o??urlu??u","ma??aza o??urlusu",
                "u??aq o??urlu??u","u??aq o??urlusu","cibgir","??antaj", "t??cav??z","qanun","h??bs etm??k","m??hk??m??",
                "zindan","g??nahkar","g??nahs??z","h??bsxana", "h??cr??","u??urmaq","xuliqanl??q","narahat????l??q",

                //31--  656
                "x??b??r","vacib","serial","hekay??", "s??n??dli","ictimai","tok ??ou","cizgi filmi",
                "h??qiq??t","jurnal","reklam","inand??rmaq", "n??v","m??sahib??","m??xbir","jurnalist", "sevimli","kanal","N?? gedir",

                //32--673
                "t??mir etm??k", "s??nd??rmaq","ehtiyac?? olmaq","yamamaq","bec??rm??k",
                "??lm??k","unutmaq","sulamaq","s??liq??siz", "s??liq??li","itirm??k","k??m??k etm??k","k??sm??k", "??zr ist??m??k","gecikm??k","q??za",

                  //33  -- 690
                "t??bii",  "f??lak??t","qas??r??a, bo??anaq","qar f??rt??nas??","me???? yan????n??", "z??lz??l??","da??q??n, sel","izdiham","kas??b",
                "evsiz","i??siz","??irkl??ndirm??","??irkl??nmi??", "m??harib??","yer","??irkli","t??miz",
                "i??","m??st??qillik","d??y????","milliyy??t", "davam etm??k","davam etm??k","davam etm??k","davam etm??k", "??syanda olmaq","imtina etm??k","t??xac","gur vaxt",


                   //35  -713
                "salamla??maq","hekay?? dan????maq","n??mr?? dem??k","h??qiq??ti demek", "yalan dem??k","zarafat etm??k","soru??maq","dan????maq", "s??hb??t etm??k","cavab verm??k","cavablamaq",

                //36  -- 724
                "g??zm??k", "qa??maq","tullanmaq","r??qs etm??k","??zm??k", "d??rma??maq","d????m??k","s??rm??k ( at,velosiped)","s??rm??k ( ma????n", "u??maq","??t??rm??k","da????maq","buraxmaq", " tutmaq",

                  //39 -- 738

                "g??n","h??ft??","ay", "il","yar??m ay","saat","d??qiq??", "saniy??","??sr","d??n??n","bug??n", "sabah","ax??am","g??norta","s??h??r",
                "gec??","gec??yar??s??","f??sil","yaz", "yay","pay??z","q????","ke????n", "n??vb??ti","sonra","indi","daha sonra", "sonra","??vv??l","ke??mi??d??","g??l??c??kd??",
                "h??mi????","ad??t??n","tez-tez","b??z??n", "t??dric??n","nadir hallarda","he?? vaxt","bir d??f??", "iki d??f??","???? d??f??","bir d??qiq??","- hal haz??rda", "tam vaxt??nda","vaxt??ndan ??vv??l","tezlikl??","bu yax??nlarda",

                 // 44-  785

               "tamamil??","sakit","itirm??k","gen", "d????m??k","hiss etm??k","bi??irm??k","soba",
                "borc verm??k","borc almaq","yoxlamaq","yoxlamaq", "t??xmin etm??k","istisna",

                 // 43 -- 799
                "??vv??lki h??yat yolda??","yar?? qiym??t", "qeyri r??smi","qeyri m??mk??n","m??kt??b??q??d??r","yenid??n etm??k",
                "t??hl??k??siz","f??hl??","??zg??????","t??limat????", "a??baz","hesablay??c??","yararl??","g??z??l",
                "yaras??z","sonsuz","c??ld","xo??b??xtc??sin??", "xo??b??xtlik","q??mginlik","q??mginlik","g??n????li",

                //42 -- 821

                "dinl??m??k","g??zl??m??k","soru??maq","??d??m??k", "g??lm??k","m??xsus olmaq","d??????nm??k","t??????kk??r etm??k",
                "??zr ist??m??k","axtarmaq","ox??amaq ","l??????td??n s??z axtarmaq", "s??brsizlikl?? g??zl??m??k","n??z??rd??n ke??irm??k","ehtiyatl?? olmaq","qay????s??na qalmaq",
                "ox??amaq ( xasiyy??tc??","qay????s??na qalmaq","yax???? olmaq ( n??d??s??","pis olmaq  ( n??d??s??)", "maraqlanmaq","qorxmaq","f??xr etm??k",

                //41  -- 844
                "m??ht??????m", "??la","q??sursuz","d??h????tli","qorxunc", "ecazkar","qorxulu","q??sursuz","d??h????tli", "nec?? d?? g??z??ldir","nec?? d?? pisdir","mehriban","sevimli", "??z??yola","alic??nab","axmaq","??z??n?? b??y??n??n","t??rbiy??li","d??c??l",


                  //  - 863
                "","",
                "","","","",
                "","","","",
                "","","","",
                "","","",""


                 };

          String bitmis_soz= "soz sayi bitmisdir";

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {


                    do {
                        secilmis = r.nextInt(Integer.parseInt(son.getText().toString()) - Integer.parseInt(baslangic.getText().toString())) + Integer.parseInt(baslangic.getText().toString());

                    } while (arrayList.contains(secilmis));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), hata,Toast.LENGTH_LONG).show();
                }

                arrayList.add(secilmis);
                deneme_sayi++;
                tercume.setText(az[secilmis]);
                if(deneme_sayi==(Integer.parseInt(son.getText().toString()) - Integer.parseInt(baslangic.getText().toString()))-1){
                    random.setClickable(false);
                    Toast.makeText(getApplicationContext(), bitmis_soz,Toast.LENGTH_LONG).show();
                }
            }
        });

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                random_soz.setText(ingilis[secilmis]);
            }
        });


    }
}