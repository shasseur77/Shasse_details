package alegeay.shassedetails;

import java.util.List;

public class RestPokemonResponse {
    private Integer count;
    private String next;
    private String previous;
    private List<Pokemon> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }

    public RestPokemonResponse(int count, String next, String previous, List results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }
}
