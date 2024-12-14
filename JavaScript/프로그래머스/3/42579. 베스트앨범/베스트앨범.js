function solution(genres, plays) {
  const genresSet = new Set(genres);
  const genresToPlaysMap = new Map();
  const genresToIdxMap = new Map();
  const idxToPlaysMap = new Map();

  for (let i = 0; i < genres.length; i++) {
    genresToPlaysMap.set(genres[i], (genresToPlaysMap.get(genres[i]) || 0) + plays[i]);
    idxToPlaysMap.set(i, plays[i]);
    genresToIdxMap.set(
      genres[i],
      genresToIdxMap.get(genres[i])
        ? [i, ...genresToIdxMap.get(genres[i])]
            .sort((a, b) => {
              if (idxToPlaysMap.get(b) === idxToPlaysMap.get(a)) return a - b;
              else return idxToPlaysMap.get(b) - idxToPlaysMap.get(a);
            })
            .slice(0, 2)
        : [i]
    );
  }

  const genresArr = [...genresSet].sort((a, b) => genresToPlaysMap.get(b) - genresToPlaysMap.get(a));
  const arr = genresArr.flatMap((el) => genresToIdxMap.get(el));
  return arr;
}