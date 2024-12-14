function solution(clothes) {
  const clothesMap = new Map();
  setClothesMap(clothesMap, clothes);
  return getCount(clothesMap);
}

function setClothesMap(map, clothes) {
  for (const [_, type] of clothes) {
    map.set(type, (map.get(type) || 0) + 1);
  }
}

function getCount(map) {
  let combinations = 1;
  for (const count of map.values()) {
    combinations *= (count + 1);
  }
  return combinations - 1;
}