import openai
import json

openai.api_base = "http://localhost:4891/v1"
openai.api_key = "not needed for a local LLM"

#Print
print("Welcome to Duffin's LLaMA Language Model!")
print("This is a local version of the Llama Language Model.")
print("It's also uncensored ;)")

# Get user input
user_input = input("Please enter your prompt: ")
# Set up the prompt and other parameters for the API request
prompt = user_input

model = "llama2_7b_chat_uncensored.Q4_0.gguf"
print("Delivering prompt to: " + model)
print("Generating response...")

# Make the API request
response = openai.Completion.create(
    model=model,
    prompt=prompt,
    max_tokens=1024,
    temperature=0.7,
    top_p=0.4,
    n=1,
    echo=True,
    stream=False
)

#Convert OpenAI response to JSON
response_json_str = json.dumps(response)

#Convert JSON to Python
api_response = json.loads(response_json_str)

#Extraction
text_response = api_response['choices'][0]['text']
print("Response generated!")
print(text_response)

# # Print the raw JSON output
# print(response)