## A. Простая сортировка

ограничение по времени на тест 2 секунды
ограничение по памяти на тест 64 мегабайта
ввод стандартный ввод
вывод стандартный вывод

Дан массив целых чисел. Ваша задача — отсортировать его в порядке неубывания.

Входные данные
В первой строке входного файла содержится число N (1≤N≤10^5) — количество элементов в массиве. 
Во второй строке находятся N целых чисел, по модулю не превосходящих 10^9.

Выходные данные
В выходной файл надо вывести этот же массив в порядке неубывания, между любыми двумя 
числами должен стоять ровно один пробел.

Примечание
Запрещается использовать стандартные сортировки.

## B. Сортировка подсчетом

ограничение по времени на тест 1 секунда
ограничение по памяти на тест 64 мегабайта
ввод стандартный ввод
вывод стандартный вывод

Дан список из N элементов, которые принимают целые значения от 0 до 100. Отсортируйте этот 
список в порядке неубывания элементов. Выведите полученный список.

Входные данные
На одной строке дан массив из N элементов. (1≤N≤2·10^5) — количество элементов в массиве. 
Гарантируется, что все элементы массива принимают целые значения от 0 до 100.

Выходные данные
Выведите отсортированный список элeментов

Примечание
Использовать встроенные функции сортировки нельзя.

## C. Количество инверсий

ограничение по времени на тест 5 секунд
ограничение по памяти на тест 256 мегабайт
ввод стандартный ввод
вывод стандартный вывод

Напишите программу, которая для заданного массива находит количество пар (i,j) таких, 
что i<j и a a_i>a_j.

Входные данные
Первая строка входного файла содержит натуральное число n (1≤n≤5*10^5) — количество элементов массива. 
Вторая строка содержит n попарно различных элементов массива A (0≤ a i ≤10^6).

Выходные данные
В выходной файл выведите одно число — ответ на задачу.

## D. Хипуй!

ограничение по времени на тест 3 секунды
ограничение по памяти на тест 256 мегабайт
ввод стандартный ввод
вывод стандартный вывод

В этой задаче вам необходимо организовать структуру данных Heap для хранения целых чисел, над которой 
определены следующие операции:

Insert(X) — добавить в Heap число X;
Extract — достать из Heap наибольшее число (удалив его при этом).
Эту задачу нужно решить без использования встроенных структур данных для поиска максимального числа.

Входные данные
Во входном файле записано количество команд N (1≤N≤100000), потом последовательность из  N команд, каждая в своей строке.

Каждая команда имеет такой формат: "0 <число>" или "1", что означает соответственно операции Insert(<число>)
и Extract. Добавляемые числа находятся в интервале от 1 до 10^7 включительно.

Гарантируется, что при выполнении команды Extract в структуре находится по крайней мере один элемент.

Выходные данные
В выходной файл для каждой команды извлечения необходимо вывести число, полученное при выполнении команды Extract.
	
## E. Быстрый поиск в массиве

ограничение по времени на тест 1 секунда
ограничение по памяти на тест 256 мегабайт
ввод стандартный ввод
вывод стандартный вывод

Дан массив из n целых чисел. Все числа от -10^9 до 10^9.

Нужно уметь отвечать на запросы вида "Cколько чисел имеют значения от l до r?".

Входные данные
Число n (1≤n≤10^5). Далее n целых чисел.

Затем число запросов k (1≤k≤10^5).

Далее k пар чисел l, r (-10^9≤l≤r≤10^9) — собственно запросы.

Выходные данные
Выведите k чисел — ответы на запросы.
	
## F. Приближенный двоичный поиск

ограничение по времени на тест 2 секунды
ограничение по памяти на тест 256 мегабайт
ввод стандартный ввод
вывод стандартный вывод
	
Даны два массива. Первый массив отсортирован по неубыванию, второй массив содержит запросы — целые числа. Для каждого 
запроса выведите число из первого массива наиболее близкое к числу в этом запросе. Если таких несколько, выведите меньшее из них.

Входные данные
В первой строке входных данных содержатся числа n и k; (0< n,k ≤10^5). Во второй строке задаются n чисел первого массива, 
отсортированного по неубыванию, а в третьей строке – k чисел второго массива. Каждое число в обоих массивах по модулю не превосходит 2·10^9.

Выходные данные
Для каждого из k чисел выведите в отдельную строку число из первого массива, наиболее близкое к данному. Если таких несколько, выведите меньшее из них.
	
## G. Очень Легкая Задача

ограничение по времени на тест 2 секунды
ограничение по памяти на тест 256 мегабайт
ввод стандартный ввод
вывод стандартный вывод

Сегодня утром жюри решило добавить в вариант олимпиады еще одну, Очень Легкую Задачу. Ответственный секретарь Оргкомитета напечатал ее условие
в одном экземпляре, и теперь ему нужно до начала олимпиады успеть сделать еще n копий. В его распоряжении имеются два ксерокса, один из которых 
копирует лист за x секунд, а другой – за y. (Разрешается использовать как один ксерокс, так и оба одновременно. Можно копировать не только с оригинала,
но и с копии.) Помогите ему выяснить, какое минимальное время для этого потребуется.

Входные данные
На вход программы поступают три натуральных числа n, x и y, разделенные пробелом (1≤n≤2·10^8, 1≤x,y≤10).

Выходные данные
Выведите одно число – минимальное время в секундах, необходимое для получения n копий.
	
## H. Дипломы

ограничение по времени на тест 1 секунда
ограничение по памяти на тест 256 мегабайт
ввод стандартный ввод
вывод стандартный вывод

Когда Петя учился в школе, он часто участвовал в олимпиадах по информатике, математике и физике. Так как он был достаточно способным мальчиком и
усердно учился, то на многих из этих олимпиад он получал дипломы. К окончанию школы у него накопилось n дипломов, причём, как оказалось, все они 
имели одинаковые размеры: w — в ширину и h — в высоту.

Сейчас Петя учится в одном из лучших российских университетов и живёт в общежитии со своими одногруппниками. Он решил украсить свою комнату, 
повесив на одну из стен свои дипломы за школьные олимпиады. Так как к бетонной стене прикрепить дипломы достаточно трудно, то он решил купить 
специальную доску из пробкового дерева, чтобы прикрепить её к стене, а к ней — дипломы. Для того чтобы эта конструкция выглядела более красиво, 
Петя хочет, чтобы доска была квадратной и занимала как можно меньше места на стене. Каждый диплом должен быть размещён строго в прямоугольнике 
размером w на h. Дипломы запрещается поворачивать на 90 градусов. Прямоугольники, соответствующие различным дипломам, не должны иметь общих внутренних точек.

Требуется написать программу, которая вычислит минимальный размер стороны доски, которая потребуется Пете для размещения всех своих дипломов.

Входные данные
Входной файл содержит три целых числа: w, h, n (1≤w,h,n≤10^9).

Выходные данные
В выходной файл необходимо вывести ответ на поставленную задачу.
	
## I. Квадратный корень и квадратный квадрат

ограничение по времени на тест 2 секунды
ограничение по памяти на тест 256 мегабайт
ввод стандартный ввод
вывод стандартный вывод

Найдите такое число x, что 'sqr(x)+sqrt(x)=C', с точностью не менее 6 знаков после точки.

Входные данные
В единственной строке содержится вещественное число 1.0≤C≤10^10.

Выходные данные
Выведите одно число — искомый x.
	
## J. Поляна дров

ограничение по времени на тест 2 секунды
ограничение по памяти на тест 256 мегабайт
ввод стандартный ввод
вывод стандартный вывод

Маленький мальчик Ферм живет в деревне. Наступают холодные времена, поэтому бабушка попросила мальчика сходить в лес, чтобы собрать дров. В 
лесу около деревни, в которой живет Ферма, находится волшебная Поляна Дров, на которой всегда лежат дрова, и никогда не кончаются. Естественно, 
Ферма должен пойти именно туда.

Единственная проблема заключается в том, что идти до Поляны не очень близко, тем более что скорость передвижения по лесу намного меньше, чем 
скорость передвижения по полю, в котором находится деревня.

 -Деревня находится в точке с координатами  (0,1).

 -Поляна находится в точке с координатами  (1,0).

 -Граница между лесом и полем — горизонтальная прямая y=a, где a — некоторое число (0≤a≤1).

 -Скорость передвижения по полю составляет V_p, скорость передвижения по лесу — V_f. Вдоль границы можно двигаться как по лесу, так и по полю.

Найдите точку, в которой мальчик Ферма должен войти в лес, чтобы дойти до Поляны Дров как можно быстрее.

Входные данные
В первой строке входного файла содержатся два положительных целых числа — V_p и V_f (1≤V_p, V_f≤10^5). Во второй строке содержится единственное 
вещественное число — координата по оси Oy границы между лесом и полем a  (0≤a≤1)

Выходные данные
В единственной строке выходного файла выведите вещественное число с точностью не менее 4 знаков после запятой — координата по оси Ox точки, в 
которой мальчик Ферма должен войти в лес.
	
## K. K-best

ограничение по времени на тест 2 секунды
ограничение по памяти на тест 256 мегабайт
ввод стандартный ввод
вывод стандартный вывод

У Демьяны есть n драгоценностей. Каждая из драгоценностей имеет ценность vi и вес wi. С тех пор, как её мужа Джонни уволили в связи с последним 
финансовым кризисом, Демьяна решила продать несколько драгоценностей. Для себя она решила оставить лишь k лучших. Лучших в смысле максимизации 
достаточно специфического выражения: пусть она оставила для себя драгоценности номер i1,i2,…,ik, тогда максимальной должна быть величина

j=[1..k]∑(v_ij)  /   j=[1..k]∑(w_ij)
Помогите Демьяне выбрать k драгоценностей требуемым образом.

Входные данные
На первой строке n и k (1≤k≤n≤100000).

Следующие n строк содержат пары целых чисел vi, wi (0≤vi≤10^6,1≤wi≤10^6, сумма всех vi не превосходит 10^7, сумма всех wi также не превосходит 10^7).

Выходные данные
Выведите k различных чисел от 1 до n — номера драгоценностей. Драгоценности нумеруются в том порядке, в котором перечислены во входных данных. 
Если есть несколько оптимальных ответов, выведите любой.