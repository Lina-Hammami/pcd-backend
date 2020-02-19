import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Administrateur } from '../models/Administrateur';

@Injectable({
    providedIn: 'root'
})
export class AuthenticationService {
    constructor(private http: HttpClient) { }
    baseUrl: string='http://localhost:8082';

    authenticate(a: Administrateur) {
        return this.http.post<Administrateur>(this.baseUrl+'/login', a) ;
    }


    isUserLoggedIn() {
        const user = sessionStorage.getItem('email');
        console.log('a' + user);
        return !(user === null);
    }

    logOut() {
        sessionStorage.removeItem('email');
    }
}

