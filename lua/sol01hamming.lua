--[[
MIT License

Copyright (c) 2023 Gillar Prasatya

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
]]

-- Create a table named Hamming to encapsulate the Hamming module.
local Hamming = {}

-- Define a function named compute that calculates the Hamming Distance between two DNA strands.
function Hamming.compute(a, b)
  -- Initialize the error count to 0.
  local errorCount = 0

  -- Check the lengths of both input strings 'a' and 'b' if it's not equal.
  if #a ~= #b then
    return -1 -- Return -1 as required when the input strings have different lengths.
  end

  -- Iterate through each character in both strings.
  for i = 1, #a do
    -- Compare characters at the same position in both strings.
    if a:sub(i, i) ~= b:sub(i, i) then
      errorCount = errorCount + 1 -- Increment the error count if characters are different.
    end
  end

  -- Return the error count as the Hamming Distance.
  return errorCount
end

-- Export the Hamming module for external use.
return Hamming
