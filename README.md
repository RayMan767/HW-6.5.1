Небольшое РПГ с героем.  
Для нашего монстра создать класс Monster c полями attack(сила атаки), health(здоровье монстра), name(имя).     
Конструктор класса Monster должен принимать значения здоровья, силы атаки и имя.  

Для героя создать класс Hero c полями attack(сила атаки), health(здоровье монстра), name(имя).    
Конструктор класса Hero должен принимать только имя героя, а здоровье и атака по умолчанию 40 и 5 .  

Наши герой и монстр должны атаковать поэтому у обоих должен быть реализован метод attack(цель атаки) принимающий цель атаки и выдающий результат атаки в консоль.
Пример кода в Main:  

Monster monster = new Monster(60,20,"Azog");  
Hero hero = new Hero("Igor");  

hero.attack(monster);  
monster.attack(hero);  
hero.attack(monster);  
monster.attack(hero);  

Результат в консоли:  
The monster Azog came!  
The hero Igor is here!  
The hero Igor deal 5 damage Azog.  
The monster Azog deal 20 damage Igor.  
The hero Igor deal 5 damage Azog.  
The monster Azog deal 20 damage Igor.  
The hero died!  

Как видно из результата герой слишком слаб, поэтому создадим на основе класса Hero класс наследник Knight.  
У нового класса атака должна быть 20 и должны появиться доспехи, которые будут уменьшать любой входящий урон на 15.   
Пример кода в Main:     
Monster monster = new Monster(60,20,"Azog");  
Hero hero = new Hero("Igor");  

hero.attack(monster);  
monster.attack(hero);  
hero.attack(monster);  
monster.attack(hero);  

Knight knight = new Knight("Richard");  

knight.attack(monster);  
monster.attack(knight);  
knight.attack(monster);  
monster.attack(knight);  
knight.attack(monster);  

Результат в консоли:  
The monster Azog came!  
The hero Igor is here!  
The hero Igor deal 5 damage Azog.  
The monster Azog deal 20 damage Igor.  
The hero Igor deal 5 damage Azog.  
The monster Azog deal 20 damage Igor.  
The hero died!  
The hero Richard is here!  
The hero Richard deal 20 damage Azog.  
The monster Azog deal 20 damage Richard.  
The hero Richard deal 20 damage Azog.  
The monster Azog deal 20 damage Richard.  
The hero Richard deal 20 damage Azog.  
The monster died!	  
