package interfaces.orders;

public interface InterfaceArticleList {
	
	InterfaceArticle getArticle(int i); //gibt den i+-ten Artikel zurück
	int getNumberArticles(); //gibt die Anzahl an Artikeln in der Liste zurück
	
	void addArticle (InterfaceArticle inArticle);

}
