# S21

4. Selon ce que j'ai pus constater, le code est plus elegante et plus comprensible. Depuis ça, avec mes experiences, est plus simple écrire un code avec les stream.

5. Le stream passera toutes les lignes du fichier avec 4 filters et affichierat le résultat. Le premier filtre regarde si la lengeur du mot est 11 characheteres. Le deuxieme si à la position 2 il y a une 't' et le troisième si à la position 4 il y a le charactere 'l'. Le dernier filtre compte qu'il za exactement 6 characteres differnts. Le résultat serait toujours le même si on change l'ordre, mais les performances seront affectée parce que on va regarder toutes les mots si le prémière filtre n'est pas le prémière ou le quatrième.
