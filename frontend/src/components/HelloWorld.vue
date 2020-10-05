<template>
  <div>
    <div v-for="(message, index) in messages" :key="index">
      {{message.message}}<br>
    </div>
    <button @click="loadMessagesFromBackend()">Reload message</button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data: function() {
    return {
      messages: [
        {
          message: 'Testing this is a new'
        },
        {
          message: 'Testing this is a new2'
        }
      ]
    }
  },
  methods: {
    loadMessagesFromBackend: function() {
      fetch('http://localhost:8080/messages')
      .then(response => response.json())
      .then(data => this.messages = data)
    }
  }
}
</script>

<style scoped>
</style>
