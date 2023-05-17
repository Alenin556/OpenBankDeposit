import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Здравствуйте ! Мы рады приветствовать вас в нашем банке.");
        System.out.println(" ");
        System.out.println("В нашем банке вы можете найти для себя, наилучшие условия для хранения своих сбережений.");
        System.out.println("Мы предлагаем :");
        System.out.println("* Годовая процентная ставка при вложении от 3-7 лет составляет 7%");
        System.out.println("* Годовая процентная ставка при вложении от 7-10 лет составляет 20%");
        System.out.println(" ");
        System.out.println("Для того чтобы открыть счет в нашем банке укажите следующие данные:");
        System.out.println(" ");
        System.out.println("1.Страну проживания;");
        System.out.println("2.Валюту в которой вы хотите хранить сбережения;");
        System.out.println("3.Вашу фамилию, имя и отчество;");
        System.out.println("4.Ваш возраст;");
        System.out.println("5.Сумму с которой вы хотите открыть счет;");
        System.out.println("6.Период на который вы хотите сделать вложение.");
        System.out.println(" ");
        System.out.println("* Учитывайте то, что наш банк открывает счет только для лиц проживающим в России;");
        System.out.println("* Валюта в которой могут храниться сбережения это руб.;");
        System.out.println("* Ваш возраст должен быть не менее 18 лет;");
        System.out.println("* Сумма вложения не должна быть менее 100 000;");
        System.out.println("* Период вложения не может быть менее 3 лет и не может превышать 10 лет.");
        System.out.println("* Годовая процентная ставка при вложении на 3 года составляет 7%");
        System.out.println("* Годовая процентная ставка при вложении на от 7-10 лет составляет 20%");


        System.out.println("Введите страну проживания.");
        System.out.println("Открытие счета доступно только для граждан проживающих на территории России.");
        String clientCountry = sc.nextLine();
        if (!(clientCountry.equals("Россия"))) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк принимает заявление на открытие счета, только от лиц проживающим на территории России.");
            System.exit(0);
        }

        System.out.println("Введите валюту в которой хотите открыть сберегательный счет.");
        System.out.println("Доступно : руб.");
        System.out.println("Недоступно : eur, usd");
        String currency = sc.nextLine();
        if (!(currency.equals("руб."))) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк принимает валюту только в рублях.");
            System.out.println("Попробуйте оформить счет с другой валютой.");
            System.exit(0);
        }

        System.out.println("Введите ваше фио. ");
        String fullName = sc.nextLine();

        System.out.println("Введите ваш возраст.");
        int age = sc.nextInt();
        if ((!(age > 18))) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк принимает заявление на открытие счета, только от лиц старше 18 лет.");
            System.exit(0);
        }

        System.out.println("Введите сумму денег.");
        System.out.println("Предупреждаем, что наш банк для открытия счета принимает стартовое вложение в размере от 100 000 руб.");
        int money = sc.nextInt();
        if (money <= 100000) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк для открытия счета принимает стартовое вложение в размере от 100 000 руб.");
            System.out.println("Укажите другую сумму.");
        }

        System.out.println("Введите период на который вы бы хотели открыть счет.");
        System.out.println("Предупреждаем, что период не может быть меньше 2 и больше 10 лет.");
        int period = sc.nextInt();

        if (period <= 2 || period > 10) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк предоставляет возможность открытия счета от 3 до 10 лет.");
            System.out.println("Укажите другой период хранения.");
        }

        System.out.println(" ");
        System.out.println(" ");


        int periodPercent; // вычисление процентной ставки
        if (period < 3 && period < 7) { // если период меньше 3 лет и не превышает 7
            periodPercent = ((money * 7) / 100) * period; // то сумма вложения умножается на ставку 7%, делится на 100, и умножаем на количество лет
        } else if (period >= 7 && period <= 10) { // иначе если
            periodPercent = ((money * 20) / 100) * period; // то сумма вложения умножается на ставку 20%, делится на 100, и умножаем на количество лет
        } else { // иначе
            periodPercent = 0; // если условия не подходят ставка не вычисляется
        }
        System.out.println(fullName);
        System.out.println("Поздравляем ! Вы успешно открыли счет в нашем банке.");
        System.out.println("На сумму :" + money);
        System.out.println("На период :" + period);
        System.out.println("По истечению срока хранения вам будут предоставлен доход от годовых процентов в размере : " + periodPercent);
        System.out.println("Будем рады вам в нашем банке.");
    }
}


