mod 77<br>
**10/09/21**

<h2>Palavra this</h2>

  Ele explicou o que é a palavra this.

================================================
mod 78

<h2>Sobrecarga</h2>

Para criar uma sobrecarga de construtores, é só você colocar
dois construtores com diferentes parametros, para um 
parâmetro ser opcional.

É possível também fazer um construtor padrão, definindo
ele sem parametros.

~~~java
class Product{

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(double price, int quantity){
        this.name = name;
        this.price = price;
        //final quantity = 0;
    }
}
~~~