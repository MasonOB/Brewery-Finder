import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

/*
 * The authorization header is set for axios when you login but what happens when you come back or
 * the page is refreshed. When that happens you need to check for the token in local storage and if it
 * exists you should set the header so that it will be attached to each request
 */
const currentToken = localStorage.getItem('token')
const currentUser = JSON.parse(localStorage.getItem('user'));

if(currentToken != null) {
  axios.defaults.headers.common['Authorization'] = `Bearer ${currentToken}`;
}

export default new Vuex.Store({
  state: {
    token: currentToken || '',
    user: currentUser || {},
    breweries: [],
    searchParams: {
      state: "",
      city: "",
      brewery_type: ""
    },
    beers: [],
    reviews: [], 
    brewery: {},
    beer: {}
  },
  mutations: {
    SET_AUTH_TOKEN(state, token) {
      state.token = token;
      localStorage.setItem('token', token);
      axios.defaults.headers.common['Authorization'] = `Bearer ${token}`
    },
    SET_USER(state, user) {
      state.user = user;
      localStorage.setItem('user',JSON.stringify(user));
    },
    LOGOUT(state) {
      localStorage.removeItem('token');
      localStorage.removeItem('user');
      state.token = '';
      state.user = {};
      axios.defaults.headers.common = {};
    },
    SAVE_SEARCH_PARAMS(state, searchParams) {
      state.searchParams = searchParams;
    },
    SET_STORE_DATA(state, breweries){
      state.breweries = breweries;
    },
    ADD_REVIEW(state, review) {
      state.reviews.unshift(review);
    },
    SET_CURRENT_BREWERY(state, brewery){
      state.brewery = brewery;
    },
    SET_BEER_DATA(state, beers){
      state.beers = beers;
    },
    SET_CURRENT_BEER(state, beer){
      state.beer = beer;
    },
    SET_REVIEWS_DATA(state, reviews){
      state.reviews = reviews;
    }
  }
})

