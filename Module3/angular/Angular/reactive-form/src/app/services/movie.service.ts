import { Injectable } from '@angular/core';
import { Movie} from './../models/movie.class';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
	public movies : Movie[] = [
		new Movie(1,'Sài Gòn Của Anh','https://www.youtube.com/watch?v=34TzyWSZIXc','HuyR'),
		new Movie(2,'Lỗi Của Anh','https://www.youtube.com/watch?v=LA7fW87KV4k','Ngô Kiến Huy')
	];

  constructor() { }
  getAllMovies(){
  	return this.movies;
  }
  addMovie(movie: Movie) {
  	movie.id = this.getLastId(this.movies);
  	this.movies.push(movie);
  }
  getLastId(movies){ // 6 5 4 3 2 1 
  	movies.sort((a,b) =>{
  		if(a.id > b.id) return -1;
  		else if (a.id < b.id) return 1;
  		else return 0;
  	});
  	return 0;
  }
}
