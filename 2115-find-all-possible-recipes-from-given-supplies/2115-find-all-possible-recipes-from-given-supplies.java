class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> store = new HashSet<>();
        for(int i = 0; i < supplies.length; i++) {
            store.add(supplies[i]);
        }
        
        boolean ans = true, track = true;
        List<String> lst = new ArrayList<String>();
        while(track){
            track = false;
            for(int i = 0; i < recipes.length; i++) {
                if(store.contains(recipes[i])) continue;
				ans = true;
				for(int j = 0; j < ingredients.get(i).size(); j++) {
					if(!store.contains(ingredients.get(i).get(j))) {
						ans = false;
						break;
					}
				}
				if(ans == true) {
					track = true;
					store.add(recipes[i]);
					lst.add(recipes[i]);
				}
			}
        }
        return lst;
        
    }
}