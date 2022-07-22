package movies;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

/* Desafios

 * Consumir o endpoint de filmes mais populares da API do IMDB. Procure tamb�m, na documenta��o da API do IMDB, o endpoint que retorna as melhores s�ries e o que retorna as s�ries mais populares.

* Usar sua criatividade para deixar a sa�da dos dados mais bonitinha: usar emojis com c�digo UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e it�lico usando c�digos ANSI, e mais!

* Colocar a chave da API do IMDB em algum lugar fora do c�digo como um arquivo de configura��o (p. ex, um arquivo .properties) ou uma vari�vel de ambiente

* Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON

* Desafio supremo: criar alguma maneira para voc� dar uma avalia��o ao filme, puxando de algum arquivo de configura��o OU pedindo a avalia��o para o usu�rio digitar no terminal.

*/

public class App {

	public static void main(String[] args) throws Exception {
		
		// fazer uma conex�o HTTP e buscar os top 250 filmes
		String url = "https://api.mocki.io/v2/549a5d8b"; // endpoint
		URI endereco = URI.create(url);
		var client = HttpClient.newHttpClient(); // m�todo est�tico = devolve um objeto novo
		var request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); // body handlers = classe que vai criar maneira de ler os dados
		String body = response.body();
		
		// extrair (parsear) s� os dados que interessam (t�tulo, poster, classifica��o)
		var parser = new JsonParser(); // chamar um objeto (classe) = construtor (construit/criar um objeto)
		List<Map<String, String>> listaDeFilmes = parser.parse(body); // map = dicion�rio que associa uma chave com um valor
		
		// exibir e manipular os dados
		for(Map<String, String> filme : listaDeFilmes) {
			System.out.print(filme.get("title")); // lista no Java sempre vem na ordem
			System.out.print(filme.get("image"));
			System.out.print(filme.get("imDbRating"));
		}
	}

}
