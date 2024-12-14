function solution(participant, completion) {
  const participantMap = new Map();
  const completionMap = new Map();
  inputPlayers(completionMap, completion);
  inputParticipant(participantMap, participant, completionMap);
  return getNonFinisher(participantMap);
}

function inputPlayers(map, players) {
  for (const player of players) {
    input(map, player);
  }
}

function input(map, player) {
  let hasEl = map.get(player) || 0;
  if (hasEl) map.set(player, ++hasEl);
  else map.set(player, 1);
}

function inputParticipant(map, players, completionMap) {
  for (const player of players) {
    let hasEl = completionMap.get(player) || 0;
    if (hasEl) completionMap.set(player, --hasEl);
    else input(map, player);
  }
}

function getNonFinisher(map) {
  for (const key of map.keys()) {
    return key;
  }
}