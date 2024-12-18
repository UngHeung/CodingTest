function solution(priorities, location) {
  const run = [];

  while (priorities.length) {
    const max = Math.max(...priorities);

    if (priorities[location] === max && location === 0) break;
    
    if (priorities[0] === max) {
      run.push(priorities.shift());
      --location
    } else {
      priorities.push(priorities.shift());
      if (location === 0) location = priorities.length - 1;
      else --location;
    }
  }

  return run.length + 1;
}