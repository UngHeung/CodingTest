function solution(progresses, speeds) {
  const answer = [];
  const queue = [];
  for (let i = 0; i < progresses.length; i++) {
    const time = Math.ceil((100 - progresses[i]) / speeds[i])
    if (i && time <= queue[queue.length - 1]) {
      answer[answer.length - 1]++;
    } else {
      answer.push(1);
      queue.push(time);
    }
  }
  return answer;
}