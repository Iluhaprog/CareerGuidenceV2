use CareerGuidenceV1;

insert into categories(id , name) values
	(0 , ""),
	(1, "Склонность к работе с людьми. Профессии, связанные с управлением, обучением, воспитанием, обслуживанием (бытовым, медицинским, справочно-информационным). Людей, успешных в профессиях этой группы, отличает общительность, способность находить общий язык с разными людьми, понимать их настроение, намерения."),
    (2, "Склонность к исследовательской (интеллектуальной) работе. Профессии, связанные с научной деятельностью. Кроме специальных знаний такие люди обычно отличаются рациональностью, независимостью суждений, аналитическим складом ума."),
    (3, "Склонность к практической деятельности. Круг этих профессий очень широк: производство и обработка металла; сборка, монтаж приборов и механизмов; ремонт, наладка, обслуживание электронного и механического оборудования; монтаж, ремонт зданий, конструкций; управление транспортом; изготовление изделий."),
    (4, "Склонность к эстетическим видам деятельности. Профессии творческого характера, связанные с изобразительной, музыкальной, литературно-художественной, актерско-сценической деятельностью. Людей творческих профессий кроме специальных способностей (музыкальных, литературных, актерских) отличает оригинальность и независимость."),
    (5, "Склонность к экстремальным видам деятельности. Профессии, связанные с занятиями спортом, путешествиями, экспедиционной работой, охранной и оперативно-розыскной деятельности, службой в армии. Все они предъявляют особые требования к физической подготовке, здоровью, волевым качествам."),
    (6, "Склонность к планово-экономическим видам деятельности. Профессии, связанные с расчетами и планированием (бухгалтер, экономист); делопроизводством, анализом текстов и их преобразованием (редактор, переводчик, лингвист); схематическим изображением объектов (чертежник, топограф). Эти профессии требуют от человека собранности и аккуратности.");
    

insert into users(id, id_category, name, surname, age, email, login, the_number_of_the_test, password) values
	(1, 0, "Ilya", "Novak", 15, "rrrr@mmm.ccc", "ilya.novak", 0,"1111"),
    (2, 0, "Ilya", "Hello", 15, "rrrk@mmm.ccc", "ilya.hello", 0,"2222");
    
insert into questions( id, name ) values
	(1, "Мне хотелось бы в своей профессиональной деятельности"),
    (2, "В книге или кинофильме меня больше всего привлекает"),
    (3, "Меня больше обрадует Нобелевская премия"),
    (4, "Я скорее соглашусь стать"),
    (5, "Будущее людей определяют"),
    (6, "Если я стану руководителем, то в первую очередь займусь"),
    (7, "На технической выставке меня больше привлечет"),
    (8, "В людях я ценю, прежде всего"),
    (9, "В свободное время мне хотелось бы"),
    (10,"В заграничных поездках меня скорее заинтересует"),
    (11,"Мне интереснее беседовать о"),
    (12,"Если бы в моей школе было всего три кружка, я бы выбрал"),
    (13,"В школе следует обратить особое внимание на"),
    (14,"Я с большим удовольствием смотрю"),
    (15,"Мне хотелось бы работать"),
    (16,"Школа в первую очередь должна"),
    (17,"Главное в жизни"),
    (18,"Государство должно в первую очередь заботиться о"),
    (19,"Мне больше всего нравятся уроки"),
    (20,"Мне интереснее было бы"),
    (21,"Я предпочитаю читать статьи о"),
    (22,"Свободное время я люблю"),
    (23,"Больший интерес у меня вызовет сообщение о"),
    (24,"Я предпочту работать");
    
insert into answers(id, id_question, name, flag, points) values 
	(1, 1, "общаться с самыми разными людьми;", false, 1),
    (2, 1, "снимать фильмы, писать книги, рисовать, выступать на сцене и т.д.", false, 4),
    (3, 1, "заниматься расчетами; вести документацию.", false, 6),
    (4, 2, "возможность следить за ходом мыслей автора;", false, 2),
    (5, 2, "художественная форма, мастерство писателя или режиссера;", false, 4),
    (6, 2, "сюжет, действия героев.", false, 5),
    (7, 3, "за общественную деятельность;", false, 1),
    (8, 3, "в области науки;", false, 2),
    (9, 3, "в области искусства.", false, 4),
    (10,4, "главным механиком;", false, 3),
    (11,4, "начальником экспедиции;", false, 5),
    (12,4, "главным бухгалтером.", false, 6),
    (13,5, "взаимопонимание между людьми;", false, 1),
    (14,5, "научные открытия;", false, 2),
    (15,5, "развитие производства.", false, 3),
    (16,6, "созданием дружного, сплоченного коллектива;", false, 1),
    (17,6, "разработкой новых технологий обучения;", false, 2),
    (18,6, "работой с документами.", false, 6),
    (19,7, "внутреннее устройство экспонатов;", false, 2),
    (20,7, "их практическое применение;", false, 3),
    (21,7, "внешний вид экспонатов (цвет, форма).", false, 4),
    (22,8, "дружелюбие и отзывчивость", false, 1),
    (23,8, "смелость и выносливость;", false, 5),
    (24,8, "обязательность и аккуратность.", false, 6),
    (25,9, "ставить различные опыты, эксперименты;", false, 2),
    (26,9, "писать стихи, сочинять музыку или рисовать;", false, 4),
    (27,9, "тренироваться.", false, 5),
    (28,10,"возможность знакомства с историей и культурой другой страныж", false, 4),
    (29,10,"экстремальный туризм (альпинизм, виндсерфинг, горные лыжи);", false, 5),
    (30,10,"деловое общение.", false, 6),
    (31,11,"человеческих взаимоотношениях;", false, 1),
    (32,11,"новой научной гипотезе;", false, 2),
    (33,11,"технических характеристиках новой модели машины, компьютера.", false, 3),
    (34,12,"технический;", false, 3),
    (35,12,"музыкальный;", false, 4),
    (36,12,"спортивный.", false, 5),
    (37,13,"улучшение взаимопонимания между учителями и учениками;", false, 1),
    (38,13,"поддержание здоровья учащихся, занятия спортом;", false, 5),
    (39,13,"укрепление дисциплины.", false, 6),
    (40,14,"научно-популярные фильмы;", false, 2),
    (41,14,"программы о культуре и искусстве;", false, 4),
    (42,14,"спортивные программы.", false, 5),
    (43,15,"с детьми или сверстниками;", false, 1),
    (44,15,"с машинами, механизмами;", false, 3),
    (45,15,"с объектами природы.", false, 5),
    (46,16,"учить общению с другими людьми;", false, 1),
    (47,16,"давать знания;", false, 3),
    (48,16,"обучать навыкам работы.", false, 6),
    (49,17,"иметь возможность заниматься творчеством;", false, 4),
    (50,17,"вести здоровый образ жизни;", false, 5),
    (51,17,"тщательно планировать свои дела.", false, 6),
    (52,18,"защите интересов и прав граждан;", false, 1),
    (53,18,"достижениях в области науки и техники;", false, 2),
    (54,18,"материальном благополучии граждан.", false, 3),
    (55,19,"труда;", false, 3),
    (56,19,"физкультуры;", false, 5),
    (57,19,"математики.", false, 6),
    (58,20,"заниматься сбытом товаров;", false, 1),
    (59,20,"изготавливать изделия;", false, 3),
    (60,20,"планировать производство товаров.", false, 6),
    (61,21,"выдающихся ученых и их открытиях;", false, 2),
    (62,21,"интересных изобретениях;", false, 3),
    (63,21,"жизни и творчестве писателей, художников, музыкантов.", false, 4),
    (64,22,"читать, думать, рассуждать;", false, 2),
    (65,22,"что-нибудь мастерить, шить, ухаживать за животными, растениями;", false, 3),
    (66,22,"ходить на выставки, концерты, в музеи.", false, 4),
    (67,23,"научном открытии;", false, 2),
    (68,23,"художественной выставке;", false, 4),
    (69,23,"экономической ситуации.", false, 6),
    (70,24,"в помещении, где много людей;", false, 1),
    (71,24,"в необычных условиях;", false, 5),
    (72,24,"в обычном кабинете.", false, 6);
    
insert into enterprices(id,name,geolocation,phone,email,login,password) values
	(1,"EPAM","brest/belarus","123456789","epam@epam.pam","epam.sys","1234"),
    (2,"Epol","brest/belarus","987654321","epol@epol.pol","epol.sys","4321");
    
    
    
insert into roles(id,name) values
	(1 , "Admin"),
    (2 , "User"),
    (3 , "Guest");
    
insert into users_has_roles(id_user , id_role) values
		(1,2),
        (2,2);
        
insert into enterprices_has_roles(id_enterprice , id_role) values
	(1,2),
    (2,2);
    
insert into works(id , id_category , name) values 
	(1 , 1 , "Аменистратор"),
    (2 , 2 , "Биоинженер"),
    (3 , 3 , "Таксист"),
    (4 , 4 , "Актер"),
    (5 , 5 , "Военный"),
    (6 , 6 , "Экономист");

insert into enterprices_has_works(id_enterprice , id_work) values
	(1 , 1),
    (1 , 2),
    (1 , 3),
    (2 , 4),
    (2 , 5),
    (2 , 6);
    

    
insert into users_has_answers(id_user , id_answer) values
	(1,2),
	(1,3);
    

